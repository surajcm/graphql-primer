package com.suraj.api.init;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.time.Duration;

@Configuration
public class Initializer {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplateBuilder()
                .setConnectTimeout(Duration.ofSeconds(90))
                .setReadTimeout(Duration.ofSeconds(90))
                .build();
    }

    @Bean
    public WebClient client() {
        return WebClient.builder()
                .baseUrl("https://swapi.dev/api/").build();
    }
}
