package com.suraj.api.film.service;

import com.suraj.api.film.connector.FilmConnector;
import com.suraj.api.film.connector.FilmsConnector;
import com.suraj.api.model.response.Film;
import com.suraj.api.model.response.Films;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmConnector filmConnector;

    @Autowired
    private FilmsConnector filmsConnector;

    @Override
    public Films getAllFilms() {
        return filmsConnector.getAllFilmsData();
    }

    @Override
    public Film getFilmById(final String id) {
        return filmConnector.getFilmById(id);
    }
}
