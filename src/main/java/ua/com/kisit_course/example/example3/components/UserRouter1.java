package ua.com.kisit_course.example.example3.components;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.*;

import static org.springframework.web.reactive.function.server.RequestPredicates.accept;


@Configuration
public class UserRouter1 {

    @Bean
    public RouterFunction<ServerResponse> userRouter(UserHandler userHandler) {
        RequestPredicate accept = accept(MediaType.APPLICATION_JSON);

        return RouterFunctions
                .route(RequestPredicates.GET("/users").
                and(accept), userHandler::findAll);
    }

}
