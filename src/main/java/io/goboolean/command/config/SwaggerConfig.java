package io.goboolean.command.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//@SecuritySchemes({
//        @SecurityScheme(
//                name = "JWT Authorization",
//                type = SecuritySchemeType.HTTP,
//                bearerFormat = "JWT",
//                scheme = "Bearer"
//        )
//})
@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
        Info info = new Info()
                .title("Goboolean Project")
                .description("Goboolean Server API Document")
                .version("1.0.0");

        return new OpenAPI()
                .components(new Components())
                .info(info);
    }
}
