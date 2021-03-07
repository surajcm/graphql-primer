package com.suraj.api.film.service;

import com.suraj.api.model.response.Film;
import com.suraj.api.model.response.Films;
import com.suraj.api.model.response.People;
import com.suraj.api.model.response.Planets;
import com.suraj.api.model.response.Species;
import com.suraj.api.model.response.StarShips;
import com.suraj.api.model.response.Vehicles;

public interface FilmService {
    Films getAllFilms();

    Film getFilmById(Long id);

    People getPeopleById(Long id);

    Planets getPlanetsById(Long id);

    StarShips getStarShipsById(Long id);

    Vehicles getVehiclesById(Long id);

    Species getSpeciesById(Long id);
}
