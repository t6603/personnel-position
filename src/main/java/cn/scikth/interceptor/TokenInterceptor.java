package cn.scikth.interceptor;




import cn.scikth.utils.JwtUtil;
import cn.scikth.utils.Result;
import com.alibaba.fastjson.JSONObject;
import io.jsonwebtoken.Claims;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.servlet.HandlerInterceptor;


public class TokenInterceptor implements HandlerInterceptor {
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("执行了拦截器");
        if ("OPTIONS".equals(request.getMethod())){
            return true;
        }
        String token=request.getHeader("jwt");
        response.setCharacterEncoding("utf-8");
        if (token==null){
            Result result=new Result("999","权限不足，请先登录");
            response.getWriter().print(JSONObject.toJSONString(result));
            return  false;
        }
        Claims claims= JwtUtil.parseJwt(token);//解析
        if (claims==null){
            Result result=new Result("998","访问超时，请重新登录");
            response.getWriter().print(JSONObject.toJSONString(result));
            return false;
        }
        request.getSession().setAttribute("username",claims.get("username"));
        request.getSession().setAttribute("uid",claims.get("uid"));
        return true;
    }
}
