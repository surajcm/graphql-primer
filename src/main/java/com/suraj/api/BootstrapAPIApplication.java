package com.suraj.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.suraj.api")
public class BootstrapAPIApplication {
    public static void main(final String[] args) {
        SpringApplication.run(BootstrapAPIApplication.class, args);
    }
}
