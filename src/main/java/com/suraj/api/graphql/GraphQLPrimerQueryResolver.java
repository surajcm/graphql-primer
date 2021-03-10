package com.suraj.api.graphql;

import com.suraj.api.film.service.FilmService;
import com.suraj.api.model.response.Film;
import com.suraj.api.model.response.Films;
import com.suraj.api.model.response.People;
import com.suraj.api.model.response.Planets;
import com.suraj.api.model.response.Species;
import com.suraj.api.model.response.StarShips;
import com.suraj.api.model.response.Vehicles;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GraphQLPrimerQueryResolver implements GraphQLQueryResolver {
    private static final Logger logger = LoggerFactory.getLogger(GraphQLPrimerQueryResolver.class);
    private static final String GRAPH_QL_REQUEST_RECEIVED_WITH_ID = "GraphQL request received with id : ";

    @Autowired
    private FilmService filmService;

    public Film film(final Long id) {
        logger.info(GRAPH_QL_REQUEST_RECEIVED_WITH_ID + id);
        Film film = filmService.getFilmById(id);
        return Optional.ofNullable(film).orElse(null);
    }

    public Films allFilms() {
        logger.info("GraphQL request received for all films");
        Films films = filmService.getAllFilms();
        return Optional.ofNullable(films).orElse(null);
    }

    public People people(final Long id) {
        logger.info(GRAPH_QL_REQUEST_RECEIVED_WITH_ID + id);
        People people = filmService.getPeopleById(id);
        return Optional.ofNullable(people).orElse(null);
    }

    public Planets planets(final Long id) {
        logger.info(GRAPH_QL_REQUEST_RECEIVED_WITH_ID + id);
        Planets planets = filmService.getPlanetsById(id);
        return Optional.ofNullable(planets).orElse(null);
    }

    public Species species(final Long id) {
        logger.info(GRAPH_QL_REQUEST_RECEIVED_WITH_ID + id);
        Species species = filmService.getSpeciesById(id);
        return Optional.ofNullable(species).orElse(null);
    }

    public StarShips starShips(final Long id) {
        logger.info(GRAPH_QL_REQUEST_RECEIVED_WITH_ID + id);
        StarShips starShips = filmService.getStarShipsById(id);
        return Optional.ofNullable(starShips).orElse(null);
    }

    public Vehicles vehicles(final Long id) {
        logger.info(GRAPH_QL_REQUEST_RECEIVED_WITH_ID + id);
        Vehicles vehicles = filmService.getVehiclesById(id);
        return Optional.ofNullable(vehicles).orElse(null);
    }
}
