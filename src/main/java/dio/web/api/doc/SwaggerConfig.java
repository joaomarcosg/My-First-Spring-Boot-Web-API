//package dio.web.api.doc;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//import java.util.Arrays;
//import java.util.HashSet;
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//    private Contact contact() {
//        return new Contact(
//                "Your name",
//                "http://www.yoursite.com.br",
//                "your@yousite.com.br");
//    }
//    private ApiInfoBuilder apiInformation() {
//        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
//
//        apiInfoBuilder.title("Title - Rest API");
//        apiInfoBuilder.description("Spring Boot REST API use example");
//        apiInfoBuilder.version("1.0");
//        apiInfoBuilder.termsOfServiceUrl("Use term: Open Source");
//        apiInfoBuilder.license("Licence - Your Company");
//        apiInfoBuilder.licenseUrl("http://www.yoursite.com.br");
//        apiInfoBuilder.contact(this.contact());
//
//        return apiInfoBuilder;
//    }
//
//    @Bean
//    public Docket apiDetail() {
//        Docket docket = new Docket(DocumentationType.SWAGGER_2);
//
//        docket
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("dio.web.api.controller"))
//                .paths(PathSelectors.any())
//                .build()
//                .apiInfo(this.apiInformation().build())
//                .consumes(new HashSet<String>(Arrays.asList("application/json")))
//                .produces(new HashSet<String>(Arrays.asList("application/json")));
//
//        return docket;
//    }
//}
