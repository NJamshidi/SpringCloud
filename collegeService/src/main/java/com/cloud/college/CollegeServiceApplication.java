package com.cloud.college;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableSwagger2
//@OpenAPIDefinition(info =
//@Info(title = "College API", version = "1.0", description = "Documentation College API v1.0")
//)
public class CollegeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CollegeServiceApplication.class, args);
    }

//    @Bean
//    public Docket swaggerApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.prs.services.college.controller"))
//                .paths(PathSelectors.any())
//                .build()
//                .apiInfo(new ApiInfoBuilder().version("1.0").title("College API").description("Documentation College API v1.0").build());
//    }

}