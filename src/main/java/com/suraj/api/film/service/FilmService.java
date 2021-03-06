package com.suraj.api.film.service;

import com.suraj.api.model.response.Film;
import com.suraj.api.model.response.Films;
import com.suraj.api.model.response.People;

public interface FilmService {
    Films getAllFilms();

    Film getFilmById(Long id);
    People getPeopleById(Long id);
}
