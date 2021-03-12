package com.suraj.api.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class WebClientConnector<T> {
    private static final Logger logger = LoggerFactory.getLogger(WebClientConnector.class);

    @Autowired
    private WebClient webClient;

    public Mono<T> process(final String uri, final Class<T> tClass) {
        return webClient
                .get()
                .uri(uri)
                .retrieve()
                .bodyToMono(tClass);
    }

    public Mono<T> process(final String uri, final Long id, final Class<T> tClass) {
        return webClient
                .get()
                .uri(uri, id)
                .retrieve()
                .bodyToMono(tClass);
    }
}
