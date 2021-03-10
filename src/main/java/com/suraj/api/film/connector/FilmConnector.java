package com.suraj.api.film.connector;

import com.suraj.api.model.response.Film;
import com.suraj.api.rest.RestConnector;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class FilmConnector extends RestConnector<Film> {

    private static final String uri = "https://swapi.dev/api/films/";

    public Film getFilmById(final Long id) {
        ResponseEntity<Film> responseEntity = process(uri + id + "/",
                HttpMethod.GET,
                entity(), Film.class);
        return responseEntity.getBody();
    }

}
