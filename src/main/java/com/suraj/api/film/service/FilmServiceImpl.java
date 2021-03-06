package com.suraj.api.film.service;

import com.suraj.api.film.connector.FilmConnector;
import com.suraj.api.film.connector.FilmsConnector;
import com.suraj.api.film.connector.PeopleConnector;
import com.suraj.api.model.response.Film;
import com.suraj.api.model.response.Films;
import com.suraj.api.model.response.People;
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
    public People getPeopleById(Long id) {
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
}
