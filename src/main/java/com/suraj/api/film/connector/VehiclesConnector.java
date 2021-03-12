package com.suraj.api.film.connector;

import com.suraj.api.model.response.Vehicles;
import com.suraj.api.rest.WebClientConnector;
import org.springframework.stereotype.Component;

@Component
public class VehiclesConnector extends WebClientConnector<Vehicles> {

    private static final String uri = "vehicles/{id}/";

    public Vehicles getVehiclesById(final Long id) {
        return process(uri, id, Vehicles.class).block();
    }
}