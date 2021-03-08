package com.suraj.api.film.connector;

import com.suraj.api.model.response.Vehicles;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

class VehiclesConnectorTest {
    @InjectMocks
    private VehiclesConnector vehiclesConnector;

    @Mock
    private RestTemplate restTemplate;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void validateGetVehiclesById() {
        String name = "TIE/LN starfighter";
        when(restTemplate.exchange(anyString(), any(HttpMethod.class),
                any(HttpEntity.class), eq(Vehicles.class)))
                .thenReturn(mockResponseEntity(name));
        Vehicles vehicles = vehiclesConnector.getVehiclesById(1L);
        Assertions.assertEquals(vehicles.getName(), name);
    }

    private ResponseEntity<Vehicles> mockResponseEntity(String name) {
        return new ResponseEntity<>(mockVehicles(name), HttpStatus.OK);
    }

    private Vehicles mockVehicles(String name) {
        Vehicles vehicles = new Vehicles();
        vehicles.setName(name);
        return vehicles;
    }
}