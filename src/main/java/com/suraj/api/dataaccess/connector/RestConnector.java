package com.suraj.api.dataaccess.connector;

import com.suraj.api.exception.BootstrapAPIException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
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
                                     final Class<T> responseType) throws BootstrapAPIException {
        ResponseEntity<T> responseEntity;
        try {
            responseEntity = restTemplate.exchange(url, method, requestEntity, responseType);
        } catch (HttpClientErrorException | HttpServerErrorException ex) {
            throw new BootstrapAPIException(ex.getResponseBodyAsString(), ex.getStatusCode());
        }
        return responseEntity;
    }

}