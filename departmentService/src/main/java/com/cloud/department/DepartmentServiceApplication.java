package com.cloud.department;

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
//@Info(title = "Department API", version = "1.0", description = "Documentation Department API v1.0")
//)
public class DepartmentServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DepartmentServiceApplication.class, args);
    }

//    @Bean
//    public Docket swaggerPersonApi10() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.cloud.department.department.controller"))
//                .paths(PathSelectors.any())
//                .build()
//                .apiInfo(new ApiInfoBuilder().version("1.0").title("Department API").description("Documentation Department API v1.0").build());
//    }

}