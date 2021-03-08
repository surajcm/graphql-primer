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
    public final PeopleConnector peopleConnector = Mockito.mock(PeopleConnector.class);
    public final PlanetsConnector planetsConnector = Mockito.mock(PlanetsConnector.class);
    public final SpeciesConnector speciesConnector = Mockito.mock(SpeciesConnector.class);
    public final StarShipConnector starShipConnector = Mockito.mock(StarShipConnector.class);
    public final VehiclesConnector vehiclesConnector = Mockito.mock(VehiclesConnector.class);

    @BeforeEach
    public void setup() {
        Whitebox.setInternalState(filmService, "filmConnector", filmConnector);
        Whitebox.setInternalState(filmService, "filmsConnector", filmsConnector);
        Whitebox.setInternalState(filmService, "peopleConnector", peopleConnector);
        Whitebox.setInternalState(filmService, "planetsConnector", planetsConnector);
        Whitebox.setInternalState(filmService, "speciesConnector", speciesConnector);
        Whitebox.setInternalState(filmService, "starShipConnector", starShipConnector);
        Whitebox.setInternalState(filmService, "vehiclesConnector", vehiclesConnector);
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

    @Test
    public void validatePeople() {
        String name = "C-3PO";
        when(peopleConnector.getPeopleById(anyLong())).thenReturn(mockPeople(name));
        People people = filmService.getPeopleById(1L);
        Assertions.assertEquals(people.getName(), name);
    }

    @Test
    public void validatePeopleError() {
        when(peopleConnector.getPeopleById(anyLong())).thenThrow(new NullPointerException());
        People people = filmService.getPeopleById(1L);
        Assertions.assertNull(people);
    }

    @Test
    public void validatePlanets() {
        String name = "Yavin IV";
        when(planetsConnector.getPlanetsById(anyLong())).thenReturn(mockPlanets(name));
        Planets planets = filmService.getPlanetsById(1L);
        Assertions.assertEquals(planets.getName(), name);
    }

    @Test
    public void validatePlanetsError() {
        when(planetsConnector.getPlanetsById(anyLong())).thenThrow(new NullPointerException());
        Planets planets = filmService.getPlanetsById(1L);
        Assertions.assertNull(planets);
    }

    @Test
    public void validateSpecies() {
        String name = "Human";
        when(speciesConnector.getSpeciesById(anyLong())).thenReturn(mockSpecies(name));
        Species species = filmService.getSpeciesById(1L);
        Assertions.assertEquals(species.getName(), name);
    }

    @Test
    public void validateSpeciesError() {
        when(speciesConnector.getSpeciesById(anyLong())).thenThrow(new NullPointerException());
        Species species = filmService.getSpeciesById(1L);
        Assertions.assertNull(species);
    }

    @Test
    public void validateStarShips() {
        String name = "Star Destroyer";
        when(starShipConnector.getStarShipsById(anyLong())).thenReturn(mockStarShips(name));
        StarShips starShips = filmService.getStarShipsById(1L);
        Assertions.assertEquals(starShips.getName(), name);
    }

    @Test
    public void validateStarShipsError() {
        when(starShipConnector.getStarShipsById(anyLong())).thenThrow(new NullPointerException());
        StarShips starShips = filmService.getStarShipsById(1L);
        Assertions.assertNull(starShips);
    }

    @Test
    public void validateVehicles() {
        String name = "TIE/LN starfighter";
        when(vehiclesConnector.getVehiclesById(anyLong())).thenReturn(mockVehicles(name));
        Vehicles vehicles = filmService.getVehiclesById(1L);
        Assertions.assertEquals(vehicles.getName(), name);
    }

    @Test
    public void validateVehiclesError() {
        when(vehiclesConnector.getVehiclesById(anyLong())).thenThrow(new NullPointerException());
        Vehicles vehicles = filmService.getVehiclesById(1L);
        Assertions.assertNull(vehicles);
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

    private People mockPeople(String name) {
        People people = new People();
        people.setName(name);
        return people;
    }

    private Planets mockPlanets(String name) {
        Planets planets = new Planets();
        planets.setName(name);
        return planets;
    }

    private Species mockSpecies(String name) {
        Species species = new Species();
        species.setName(name);
        return species;
    }

    private StarShips mockStarShips(String name) {
        StarShips starShips = new StarShips();
        starShips.setName(name);
        return starShips;
    }

    private Vehicles mockVehicles(String name) {
        Vehicles vehicles = new Vehicles();
        vehicles.setName(name);
        return vehicles;
    }

}