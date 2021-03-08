package com.suraj.api.film.connector;

import com.suraj.api.model.response.Planets;
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

class PlanetsConnectorTest {
    @InjectMocks
    private PlanetsConnector planetsConnector;

    @Mock
    private RestTemplate restTemplate;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void validateGetPlanetsById() {
        String name = "Yavin IV";
        when(restTemplate.exchange(anyString(), any(HttpMethod.class),
                any(HttpEntity.class), eq(Planets.class)))
                .thenReturn(mockResponseEntity(name));
        Planets planets = planetsConnector.getPlanetsById(1L);
        Assertions.assertEquals(planets.getName(), name);
    }

    private ResponseEntity<Planets> mockResponseEntity(String name) {
        return new ResponseEntity<>(mockPlanets(name), HttpStatus.OK);
    }

    private Planets mockPlanets(String name) {
        Planets planets = new Planets();
        planets.setName(name);
        return planets;
    }
}