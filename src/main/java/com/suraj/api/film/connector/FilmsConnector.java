package com.suraj.api.film.connector;

import com.suraj.api.model.response.Films;
import com.suraj.api.rest.RestConnector;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class FilmsConnector extends RestConnector<Films> {

    final String uri = "https://swapi.dev/api/films/";

    public Films getAllFilmsData() {
        ResponseEntity<Films> responseEntity = process(uri,
                HttpMethod.GET,
                entity(), Films.class);
        return responseEntity.getBody();
    }

}