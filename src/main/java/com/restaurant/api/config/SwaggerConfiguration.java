package com.restaurant.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * packageName : com.restaurant.api.config
 * className : SwaggerConfiguration
 * user : jwlee
 * date : 2023/01/18
 */
@Configuration
public class SwaggerConfiguration {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(initApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.restaurant.api"))
                .build()
                ;
    }

    private ApiInfo initApiInfo() {
        return new ApiInfoBuilder()
                .title("Restaurant Rest API")
                .description("세훈이형 가게 관련 API 정보")
                .version("1.0.0")
                .build();
    }
}
