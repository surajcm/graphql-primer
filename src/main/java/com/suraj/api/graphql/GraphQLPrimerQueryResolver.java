package com.suraj.api.graphql;

import com.suraj.api.film.service.FilmService;
import com.suraj.api.model.response.Film;
import com.suraj.api.model.response.TempFilm;
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

    public TempFilm film(final Long id) {
        logger.info("GraphQL request received with id : " + id);
        Film film = filmService.getFilmById(id);
        return Optional.ofNullable(new TempFilm().fromFilm(film)).orElse(null);
    }
}
