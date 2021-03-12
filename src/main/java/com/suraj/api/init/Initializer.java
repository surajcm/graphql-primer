package com.suraj.api.init;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class Initializer {

    @Bean
    public WebClient client() {
        return WebClient.builder()
                .baseUrl("https://swapi.dev/api/").build();
    }
}
