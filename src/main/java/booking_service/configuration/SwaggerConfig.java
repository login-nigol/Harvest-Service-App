//package booking_service.configuration;
//
//import io.swagger.v3.oas.models.OpenAPI;
//import io.swagger.v3.oas.models.info.Info;
//import io.swagger.v3.oas.models.Components;
//import io.swagger.v3.oas.models.security.SecurityScheme;
//
//import io.swagger.v3.oas.models.servers.Server;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.List;
//
//@Configuration
//public class SwaggerConfig {
//
//    @Bean
//    public OpenAPI customOpenAPI() {
//        return new OpenAPI()
//                .servers(List.of(new Server().url("https://localhost:8080")))
//                .info(new Info().title("Ticket Booking Service API")
//                        .description("Сервис бронирования билетов на мероприятия")
//                        .version("Version: 1.0"))
//                .components(new Components()
//                        .addSecuritySchemes("Bearer Authentication",
//                                new io.swagger.v3.oas.models.security.SecurityScheme()
//                                        .type(SecurityScheme.Type.HTTP)
//                                        .scheme("bearer")
//                                        .bearerFormat("JWT")));
//    }
//}