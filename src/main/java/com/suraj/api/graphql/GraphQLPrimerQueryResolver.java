package com.suraj.api.graphql;

import com.suraj.api.film.service.FilmService;
import com.suraj.api.model.response.Film;
import com.suraj.api.model.response.People;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GraphQLPrimerQueryResolver implements GraphQLQueryResolver {
    private static final Logger logger = LoggerFactory.getLogger(GraphQLPrimerQueryResolver.class);

    @Autowired
    private FilmService filmService;

    public Film film(final Long id) {
        logger.info("GraphQL request received with id : " + id);
        Film film = filmService.getFilmById(id);
        return Optional.ofNullable(film).orElse(null);
    }

    public People people(final Long id) {
        logger.info("GraphQL request received with id : " + id);
        People people = filmService.getPeopleById(id);
        return Optional.ofNullable(people).orElse(null);
    }
}
