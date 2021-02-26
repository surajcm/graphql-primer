package com.suraj.api.film.service;

import com.suraj.api.model.response.Film;

public interface FilmService {
    String getAllFilms();

    Film getFilmById(String id);
}
