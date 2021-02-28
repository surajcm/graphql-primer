package com.suraj.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.suraj.api")
public class GraphQLPrimerApplication {
    public static void main(final String[] args) {
        SpringApplication.run(GraphQLPrimerApplication.class, args);
    }
}
