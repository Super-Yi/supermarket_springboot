package com.superyi.supermarket_springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hzy
 * @date 2021/4/13
 **/
@Configuration
public class SwaggerConfig {
    //swagger的bean实例
    @Bean
    public Docket initDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(initApiInfo())
                .securitySchemes(securitySchemes())
                .securityContexts(securityContexts())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.superyi.supermarket_springboot.controller"))
                .paths(PathSelectors.regex("^(?!auth).*$"))
                .build();
    }

    private ApiInfo initApiInfo(){
        Contact contact = new Contact("superyi" ,"http://www.baidu.com", "303798701@qq.com");
        return new ApiInfoBuilder()
                .title("swagger2")
                .description("接口测试")
                .version("v1.0")
                .termsOfServiceUrl("http://www.baidu.com")
                .license("apach")
                .contact(contact)
                .build();
    }


    public List<ApiKey> securitySchemes(){
        List<ApiKey> apiKeys=new ArrayList<>();
        apiKeys.add(new ApiKey("oauth2 认证","Authorization","header"));

        return apiKeys;
    }

    public List<SecurityContext> securityContexts(){
        List<SecurityContext> securityContexts=new ArrayList<>();
        securityContexts.add(SecurityContext.builder()
                .securityReferences(securityReferences())
                .forPaths(PathSelectors.any()).build());

        return securityContexts;
    }

    public List<SecurityReference> securityReferences(){
        AuthorizationScope[] authorizationScopes=new AuthorizationScope[1];
        authorizationScopes[0]=new AuthorizationScope("global","accessEverything");

        List<SecurityReference> securityReferences=new ArrayList<>();
        securityReferences.add(new SecurityReference("Authorization",authorizationScopes));

        return securityReferences;
    }
}
