package com.zhengyang.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;


@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiinfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.zhengyang.api.controller"))
                .build();

    }

    Contact contact=new Contact("zhengyang","www.google.com","zhengyang7180@gmail.com");
    private ApiInfo apiinfo(){
        return new ApiInfo("zhengyang API","wsssss", "v1.0","www.google.com",contact,"Apache 2.0","www.dddd",new ArrayList());


    }








}
//public class SwaggerConfig {
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.any())
//                .paths(PathSelectors.any())
//                .build();
//    }
//}

