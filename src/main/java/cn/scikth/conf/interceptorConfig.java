package cn.scikth.conf;


import cn.scikth.interceptor.TokenInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class interceptorConfig implements WebMvcConfigurer {
    public void addInterceptors(InterceptorRegistry registry){
        //拦截路径
        String[] addPathPatterns={"/**"};
        //String[] addPathPatterns = {"/**"}
        //排除路径
//        String[] excludePathPatterns={"/user/usernameLogin","/user/sendCode","/user/file","/user/register","/user/smsLogin","/alipay/**","/api/**"};
        String[] excludePathPatterns={"/**"};
        registry.addInterceptor(tokenInterceptor())
                .addPathPatterns(addPathPatterns)
                .excludePathPatterns(excludePathPatterns);
    }
    @Bean
    public TokenInterceptor tokenInterceptor(){
        return new TokenInterceptor();
    }
}
