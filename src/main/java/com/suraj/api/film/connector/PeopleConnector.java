package com.suraj.api.film.connector;

import com.suraj.api.model.response.People;
import com.suraj.api.rest.WebClientConnector;
import org.springframework.stereotype.Component;

@Component
public class PeopleConnector extends WebClientConnector<People> {

    private static final String uri = "people/{id}/";

    public People getPeopleById(final Long id) {
        return process(uri, id, People.class).block();
    }
}
