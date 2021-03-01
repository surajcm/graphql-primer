package com.suraj.api.film.service;

import com.suraj.api.model.response.Film;
import com.suraj.api.model.response.Films;

public interface FilmService {
    Films getAllFilms();

    Film getFilmById(String id);
}
