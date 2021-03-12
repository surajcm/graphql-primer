package com.suraj.api.film.connector;

import com.suraj.api.model.response.Films;
import com.suraj.api.rest.WebClientConnector;
import org.springframework.stereotype.Component;

@Component
public class FilmsConnector extends WebClientConnector<Films> {

    private static final String uri = "films/";

    public Films getAllFilmsData() {
        return process(uri, Films.class).block();
    }

}