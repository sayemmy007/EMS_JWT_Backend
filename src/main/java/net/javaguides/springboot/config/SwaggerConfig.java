package net.javaguides.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "Requestor-Type", exposedHeaders = "X-Get-Header")
//@CrossOrigin("*")
//@CrossOrigin(origins = "http://localhost:4200")
@Configuration
@EnableSwagger2
public class SwaggerConfig {
        
        @Bean
        public Docket api() {
                return new Docket(DocumentationType.SWAGGER_2)
                		
                                .select()
                                .apis(RequestHandlerSelectors.basePackage("net.javaguides.springboot.controller"))
                                .paths(PathSelectors.any())
                                .build();
        }

}
