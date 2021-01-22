package com.example.dubboconsumer.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author zk
 * @date 2021/1/22 16:25
 */
@EnableSwagger2
@Configuration
public class Swagger2 {
    @Bean
    public Docket createRestApi() {
        ApiInfo apiInfo = new ApiInfoBuilder()
                .title("dubbo-demo")
                .description("服务接口文档,严格遵循RESTful API设计规范")
                .termsOfServiceUrl("http://www.baidu.com")
                .contact(new Contact("zk","https://mail.163.com/","apm_800@163.com"))
                .version("1.0")
                .build();

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo)
                .select()
                //以扫描包的方式
                .apis(RequestHandlerSelectors.basePackage("com.example.dubboconsumer.controller"))
                .paths(PathSelectors.any())
                .build();
    }
}
