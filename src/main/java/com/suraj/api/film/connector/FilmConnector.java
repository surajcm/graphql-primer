package com.suraj.api.film.connector;

import com.suraj.api.model.response.Film;
import com.suraj.api.dataaccess.connector.RestConnector;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class FilmConnector extends RestConnector<Film> {

    final String uri = "https://swapi.dev/api/films/";

    public Film getFilmById(final String id) {
        ResponseEntity<Film> responseEntity = process(uri + id + "/",
                HttpMethod.GET,
                entity(), Film.class);
        return responseEntity.getBody();
    }

    private HttpEntity<String> entity() {
        return new HttpEntity<>(getHeaders());
    }

    private HttpHeaders getHeaders() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-Type", "application/json");
        return httpHeaders;
    }

}
