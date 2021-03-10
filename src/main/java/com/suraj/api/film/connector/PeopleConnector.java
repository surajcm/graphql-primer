package com.suraj.api.film.connector;

import com.suraj.api.model.response.People;
import com.suraj.api.rest.RestConnector;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class PeopleConnector extends RestConnector<People> {

    private static final String uri = "https://swapi.dev/api/people/";

    public People getPeopleById(final Long id) {
        ResponseEntity<People> responseEntity = process(uri + id + "/",
                HttpMethod.GET,
                entity(), People.class);
        return responseEntity.getBody();
    }
}
