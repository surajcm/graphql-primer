package com.suraj.api.film.service;

import com.suraj.api.film.connector.FilmConnector;
import com.suraj.api.film.connector.FilmsConnector;
import com.suraj.api.model.response.Film;
import com.suraj.api.model.response.Films;
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
        } catch (Exception e) {
            e.printStackTrace();
        }
        return film;
    }
}
