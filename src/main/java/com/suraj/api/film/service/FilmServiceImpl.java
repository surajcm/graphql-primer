package com.suraj.api.film.service;

import com.suraj.api.film.connector.FilmConnector;
import com.suraj.api.film.connector.FilmsConnector;
import com.suraj.api.film.connector.PeopleConnector;
import com.suraj.api.film.connector.PlanetsConnector;
import com.suraj.api.film.connector.SpeciesConnector;
import com.suraj.api.film.connector.StarShipConnector;
import com.suraj.api.film.connector.VehiclesConnector;
import com.suraj.api.model.response.Film;
import com.suraj.api.model.response.Films;
import com.suraj.api.model.response.People;
import com.suraj.api.model.response.Planets;
import com.suraj.api.model.response.Species;
import com.suraj.api.model.response.StarShips;
import com.suraj.api.model.response.Vehicles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmServiceImpl implements FilmService {

    private static final Logger logger = LoggerFactory.getLogger(FilmServiceImpl.class);

    @Autowired
    private FilmConnector filmConnector;

    @Autowired
    private FilmsConnector filmsConnector;

    @Autowired
    private PeopleConnector peopleConnector;

    @Autowired
    private PlanetsConnector planetsConnector;

    @Autowired
    private StarShipConnector starShipConnector;

    @Autowired
    private VehiclesConnector vehiclesConnector;

    @Autowired
    private SpeciesConnector speciesConnector;

    @Override
    public Films getAllFilms() {
        logger.info("Calling all films");
        return filmsConnector.getAllFilmsData();
    }

    @Override
    public Film getFilmById(final Long id) {
        logger.info("Calling films by id on :" + id);
        Film film = null;
        try {
            film = filmConnector.getFilmById(id);
            logger.info("Response is " + film);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return film;
    }

    @Override
    public People getPeopleById(final Long id) {
        logger.info("Calling people by id on :" + id);
        People people = null;
        try {
            people = peopleConnector.getPeopleById(id);
            logger.info("Response is " + people);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return people;
    }

    @Override
    public Planets getPlanetsById(final Long id) {
        logger.info("Calling planets by id on :" + id);
        Planets planets = null;
        try {
            planets = planetsConnector.getPlanetsById(id);
            logger.info("Response is " + planets);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return planets;
    }

    @Override
    public StarShips getStarShipsById(final Long id) {
        logger.info("Calling StarShips by id on :" + id);
        StarShips starShips = null;
        try {
            starShips = starShipConnector.getStarShipsById(id);
            logger.info("Response is " + starShips);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return starShips;
    }

    @Override
    public Vehicles getVehiclesById(final Long id) {
        logger.info("Calling Vehicles by id on :" + id);
        Vehicles vehicles = null;
        try {
            vehicles = vehiclesConnector.getVehiclesById(id);
            logger.info("Response is " + vehicles);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return vehicles;
    }

    @Override
    public Species getSpeciesById(final Long id) {
        logger.info("Calling Species by id on :" + id);
        Species species = null;
        try {
            species = speciesConnector.getSpeciesById(id);
            logger.info("Response is " + species);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return species;
    }
}
