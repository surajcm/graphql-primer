package com.suraj.api.film.connector;

import com.suraj.api.model.response.StarShips;
import com.suraj.api.rest.WebClientConnector;
import org.springframework.stereotype.Component;

@Component
public class StarShipConnector extends WebClientConnector<StarShips> {

    private static final String uri = "starships/{id}/";

    public StarShips getStarShipsById(final Long id) {
        return process(uri, id, StarShips.class).block();
    }
}