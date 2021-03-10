package com.suraj.api.film.connector;

import com.suraj.api.model.response.Vehicles;
import com.suraj.api.rest.RestConnector;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class VehiclesConnector extends RestConnector<Vehicles> {

    private static final String uri = "https://swapi.dev/api/vehicles/";

    public Vehicles getVehiclesById(final Long id) {
        ResponseEntity<Vehicles> responseEntity = process(uri + id + "/",
                HttpMethod.GET,
                entity(), Vehicles.class);
        return responseEntity.getBody();
    }
}