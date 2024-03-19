package cn.scikth.utils;



import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.UUID;

public class JwtUtil {
//    private static long time=1000*60*10;
    private static long time=1000*60*60; //1小时
    private static String signature="kgc123"; //签名密钥

    public static String createJwt(Integer userId,String username){
        return Jwts.builder()
                //第一部分 jwt头 header
                .setHeaderParam("typ","JWT")
                .setHeaderParam("alg","HS256")

                //第二部分 有效载荷 payload
                //私有字段
                .claim("uid",userId)
                .claim("username",username)
             /*   .claim("userCardNo",userCardNo)
                .claim("userTel",userTel)
                .claim("userAddress",userAddress)
                .claim("userPostNumber",userPostNumber)
                .claim("userIsAdmin",userIsAdmin)
                .claim("userQuestion",userQuestion)*/
                //默认字段
                .setSubject("kgc") //令牌主题
                .setIssuedAt(new Date()) //签发时间
                .setExpiration(new Date(System.currentTimeMillis()+time)) //过期时间
                .setId(UUID.randomUUID().toString()) //唯一标识，防止重复攻击

                //第三部分 签名哈希
                .signWith(SignatureAlgorithm.HS256,signature)
                .compact(); //将三部分连接起来
    }

    public static Claims parseJwt(String jwt){
        Claims claims=null;
        if(jwt==null){
            return null;
        }
        try {
            Jws<Claims> claimsJws = Jwts.parser().setSigningKey(signature).parseClaimsJws(jwt);
            //claimsJws.getHeader();
            claims = claimsJws.getBody();
            //System.out.println(claimsJws.getSignature());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return claims;
    }
}
