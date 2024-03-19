package cn.scikth.conf;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@Configuration
@EnableOpenApi
public class Swagger2Config {
    //http://localhost:9000/swagger-ui/
    @Bean
    public Docket adminApiConfig(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("adminApi")
                .apiInfo(adminApiInfo())
                .select()
                //.paths(Predicates.and(PathSelectors.regex("/admin/.*")))
                //.paths(PathSelectors.any())
                //.paths(PathSelectors.ant("/admin/**"))
                .build();
    }



    private ApiInfo adminApiInfo(){
        return new ApiInfoBuilder()
                .title("后台管理系统的API文档")
                .description("本文档描述了XX【后台管理系统】的api接口定义")
                .version("1.0")
                .contact(new Contact("t", "http://www.kgc.cn", "1251064030@qq.com"))
                .build();
    }
}
