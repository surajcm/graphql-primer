package com.suraj.api.film.connector;

import com.suraj.api.model.response.Planets;
import com.suraj.api.rest.RestConnector;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class PlanetsConnector  extends RestConnector<Planets> {

    final String uri = "https://swapi.dev/api/planets/";

    public Planets getPlanetsById(final Long id) {
        ResponseEntity<Planets> responseEntity = process(uri + id + "/",
                HttpMethod.GET,
                entity(), Planets.class);
        return responseEntity.getBody();
    }

}
