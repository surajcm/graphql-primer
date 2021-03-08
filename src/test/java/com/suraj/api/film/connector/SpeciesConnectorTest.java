package com.suraj.api.film.connector;

import com.suraj.api.model.response.Species;
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

class SpeciesConnectorTest {
    @InjectMocks
    private SpeciesConnector speciesConnector;

    @Mock
    private RestTemplate restTemplate;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void validateGetSpeciesById() {
        String name = "Human";
        when(restTemplate.exchange(anyString(), any(HttpMethod.class),
                any(HttpEntity.class), eq(Species.class)))
                .thenReturn(mockResponseEntity(name));
        Species species = speciesConnector.getSpeciesById(1L);
        Assertions.assertEquals(species.getName(), name);
    }

    private ResponseEntity<Species> mockResponseEntity(String name) {
        return new ResponseEntity<>(mockSpecies(name), HttpStatus.OK);
    }

    private Species mockSpecies(String name) {
        Species species = new Species();
        species.setName(name);
        return species;
    }

}