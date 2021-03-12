package com.suraj.api.film.connector;

import com.suraj.api.model.response.Planets;
import com.suraj.api.rest.WebClientConnector;
import org.springframework.stereotype.Component;

@Component
public class PlanetsConnector  extends WebClientConnector<Planets> {

    private static final String uri = "planets/{id}/";

    public Planets getPlanetsById(final Long id) {

        return process(uri, id, Planets.class).block();
    }

}
