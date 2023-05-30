package kr.co.jbbank.testproject.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfiguration {

    // 접속 경로 : http://localhost:8080/swagger-ui/
    @Bean
    public Docket api() {
                return new Docket(DocumentationType.SWAGGER_2)
        .apiInfo(apiInfo())
        .select()
        .apis(RequestHandlerSelectors.basePackage("kr.co.jbbank.testproject"))
        .paths(PathSelectors.any())
        .build();


    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("Around Hub Open API Test with Swagger")
            .description("설명부분")
            .version("1.0.0")
            .build();
    }
}
