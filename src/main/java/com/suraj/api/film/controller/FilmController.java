package com.suraj.api.film.controller;

import com.suraj.api.model.response.Film;
import com.suraj.api.film.service.FilmService;
import com.suraj.api.model.response.Films;
import com.suraj.api.model.response.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmController {

    @Autowired
    private FilmService filmService;

    /**
     * Request URL : http://localhost:8080/allfilms .
     */
    @GetMapping("/allfilms")
    @ResponseBody
    public Films getAllFilms() {
        return filmService.getAllFilms();
    }

    /**
     * Request URL : http://localhost:8080/film?id=1 .
     * id can take any value from 1 to 6
     */
    @GetMapping("/film")
    @ResponseBody
    public Film getFilmById(@RequestParam final Long id) {
        return filmService.getFilmById(id);
    }

    /**
     * Request URL : http://localhost:8080/people?id=1 .
     * id can take any value from 1 to 6
     */
    @GetMapping("/people")
    @ResponseBody
    public People getPeopleById(@RequestParam final Long id) {
        return filmService.getPeopleById(id);
    }
}
