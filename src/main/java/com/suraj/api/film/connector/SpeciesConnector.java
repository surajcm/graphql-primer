package com.suraj.api.film.connector;

import com.suraj.api.model.response.Species;
import com.suraj.api.rest.RestConnector;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class SpeciesConnector extends RestConnector<Species> {

    private static final String uri = "https://swapi.dev/api/species/";

    public Species getSpeciesById(final Long id) {
        ResponseEntity<Species> responseEntity = process(uri + id + "/",
                HttpMethod.GET,
                entity(), Species.class);
        return responseEntity.getBody();
    }
}