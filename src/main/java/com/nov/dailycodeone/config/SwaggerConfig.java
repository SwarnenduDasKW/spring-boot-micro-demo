package com.nov.dailycodeone.config;


import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	//To open Swagger-UI navigate to the below link. The "/" at the end of the url is important
	//http://localhost:8082/swagger-ui/
	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.any())              
          .paths(PathSelectors.any())                          
          .build()
          .apiInfo(apiDetails());                                           
    }
	
	private ApiInfo apiDetails() {
		return new ApiInfo("Department API", "A demo department api", "1.0", "Learned from YouTube"
				, new springfox.documentation.service.Contact("Swarnendu Das", "www.google.com", "ssd@gmail.com")
				, "API License"	,"http://linkedin.com",Collections.emptyList());
				
	}
}
