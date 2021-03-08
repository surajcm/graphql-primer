package com.suraj.api.film.connector;

import com.suraj.api.model.response.StarShips;
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

class StarShipConnectorTest {
    @InjectMocks
    private StarShipConnector starShipConnector;

    @Mock
    private RestTemplate restTemplate;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void validateGetStarShipsById() {
        String name = "Star Destroyer";
        when(restTemplate.exchange(anyString(), any(HttpMethod.class),
                any(HttpEntity.class), eq(StarShips.class)))
                .thenReturn(mockResponseEntity(name));
        StarShips starShips = starShipConnector.getStarShipsById(1L);
        Assertions.assertEquals(starShips.getName(), name);
    }

    private ResponseEntity<StarShips> mockResponseEntity(String name) {
        return new ResponseEntity<>(mockStarShips(name), HttpStatus.OK);
    }

    private StarShips mockStarShips(String name) {
        StarShips starShips = new StarShips();
        starShips.setName(name);
        return starShips;
    }

}