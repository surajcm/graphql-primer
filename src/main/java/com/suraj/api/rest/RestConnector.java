package com.suraj.api.rest;

import com.suraj.api.film.exception.PrimerException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;


public class RestConnector<T> {
    private static final Logger logger = LoggerFactory.getLogger(RestConnector.class);
    @Autowired
    private RestTemplate restTemplate;

    public ResponseEntity<T> process(final String url,
                                     final HttpMethod method,
                                     final HttpEntity<?> requestEntity,
                                     final Class<T> responseType) throws PrimerException {
        ResponseEntity<T> responseEntity;
        try {
            responseEntity = restTemplate.exchange(url, method, requestEntity, responseType);
        } catch (HttpClientErrorException | HttpServerErrorException ex) {
            throw new PrimerException(ex.getResponseBodyAsString(), ex.getStatusCode());
        }
        return responseEntity;
    }

    public HttpEntity<String> entity() {
        return new HttpEntity<>(getHeaders());
    }

    private HttpHeaders getHeaders() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-Type", "application/json");
        return httpHeaders;
    }

}