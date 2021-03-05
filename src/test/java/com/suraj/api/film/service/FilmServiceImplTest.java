package com.suraj.api.film.service;

import com.suraj.api.film.connector.FilmConnector;
import com.suraj.api.film.connector.FilmsConnector;
import com.suraj.api.model.response.Film;
import com.suraj.api.model.response.Films;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.powermock.reflect.Whitebox;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
class FilmServiceImplTest {
    public final FilmServiceImpl filmService = new FilmServiceImpl();
    public final FilmConnector filmConnector = Mockito.mock(FilmConnector.class);
    public final FilmsConnector filmsConnector = Mockito.mock(FilmsConnector.class);

    @BeforeEach
    public void setup() {
        Whitebox.setInternalState(filmService, "filmConnector", filmConnector);
        Whitebox.setInternalState(filmService, "filmsConnector", filmsConnector);
    }

    @Test
    public void validateFilm() {
        String title = "The Empire Strikes Back";
        when(filmConnector.getFilmById(anyLong())).thenReturn(mockFilm(title));
        Film film = filmService.getFilmById(1L);
        Assertions.assertEquals(film.getTitle(), title);
    }

    @Test
    public void validateFilmError() {
        when(filmConnector.getFilmById(anyLong())).thenThrow(new NullPointerException());
        Film film = filmService.getFilmById(1L);
        Assertions.assertNull(film);
    }

    @Test
    public void validateFilms() {
        String title = "The Empire Strikes Back";
        when(filmsConnector.getAllFilmsData()).thenReturn(mockFilms(title));
        Films films = filmService.getAllFilms();
        Assertions.assertEquals(films.getResults().get(0).getTitle(), title);
    }

    private Films mockFilms(String title) {
        Films films = new Films();
        films.setResults(List.of(mockFilm(title)));
        return films;
    }

    private Film mockFilm(String title) {
        Film film = new Film();
        film.setTitle(title);
        return film;
    }

}