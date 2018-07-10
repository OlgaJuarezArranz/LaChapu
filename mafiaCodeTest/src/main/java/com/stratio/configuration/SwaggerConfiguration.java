package com.stratio.configuration;

import java.util.Date;

import org.joda.time.LocalDateTime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
	
	private String PACKAGE_CONTROLLER = "com.stratio.controllers";
	 
    @Bean
    public Docket newsApi() {
        return new Docket(DocumentationType.SWAGGER_2)
            .groupName("api-infos")
            .apiInfo(apiInfo())
           // .directModelSubstitute(LocalDateTime.class, Date.class)
            .select()
            .apis(RequestHandlerSelectors.any())
            .apis(RequestHandlerSelectors.basePackage(PACKAGE_CONTROLLER))
            .paths(PathSelectors.any())     
            .build();
    }
 
    private ApiInfo apiInfo() {
    	return new ApiInfoBuilder()
			.title("Infos Mafia Code Test API")
            .description("REST API  Mafia Code Test")                
            .build();
    }

}
