package com.suraj.api.film.connector;

import com.suraj.api.model.response.StarShips;
import com.suraj.api.rest.RestConnector;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class StarShipConnector extends RestConnector<StarShips> {

    final String uri = "https://swapi.dev/api/starships/";

    public StarShips getStarShipsById(final Long id) {
        ResponseEntity<StarShips> responseEntity = process(uri + id + "/",
                HttpMethod.GET,
                entity(), StarShips.class);
        return responseEntity.getBody();
    }
}