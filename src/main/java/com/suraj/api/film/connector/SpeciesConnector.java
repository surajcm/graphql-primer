package com.suraj.api.film.connector;

import com.suraj.api.model.response.Species;
import com.suraj.api.rest.WebClientConnector;
import org.springframework.stereotype.Component;

@Component
public class SpeciesConnector extends WebClientConnector<Species> {

    private static final String uri = "species/{id}/";

    public Species getSpeciesById(final Long id) {
        return process(uri, id, Species.class).block();
    }
}