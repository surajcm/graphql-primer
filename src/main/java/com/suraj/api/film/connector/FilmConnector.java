package com.suraj.api.film.connector;

import com.suraj.api.model.response.Film;
import com.suraj.api.rest.WebClientConnector;
import org.springframework.stereotype.Component;

@Component
public class FilmConnector extends WebClientConnector<Film> {

    private static final String uri = "films/{id}/";

    public Film getFilmById(final Long id) {
        return process(uri, id, Film.class).block();
    }

}
