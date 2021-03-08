package com.suraj.api.film.connector;


import com.suraj.api.model.response.People;
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

class PeopleConnectorTest {
    @InjectMocks
    private PeopleConnector peopleConnector;

    @Mock
    private RestTemplate restTemplate;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void validateGetPeopleById() {
        String name = "C-3PO";
        when(restTemplate.exchange(anyString(), any(HttpMethod.class),
                any(HttpEntity.class), eq(People.class)))
                .thenReturn(mockResponseEntity(name));
        People people = peopleConnector.getPeopleById(1L);
        Assertions.assertEquals(people.getName(), name);
    }

    private ResponseEntity<People> mockResponseEntity(String name) {
        return new ResponseEntity<>(mockPeople(name), HttpStatus.OK);
    }

    private People mockPeople(String name) {
        People people = new People();
        people.setName(name);
        return people;
    }

}