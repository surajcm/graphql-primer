package com.suraj.api.film.connector;


import com.suraj.api.model.response.Film;
import com.suraj.api.model.response.Films;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

class FilmsConnectorTest {
    @InjectMocks
    private FilmsConnector filmsConnector;

    @Mock
    private RestTemplate restTemplate;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void validateGetFilmById() {
        String title = "The Empire Strikes Back";
        when(restTemplate.exchange(anyString(), any(HttpMethod.class),
                any(HttpEntity.class), any(Class.class)))
                .thenReturn(mockResponseEntity(title));
        Films films = filmsConnector.getAllFilmsData();
        Assertions.assertEquals(films.getResults().get(0).getTitle(), title);
    }

    private ResponseEntity<Films> mockResponseEntity(String title) {
        return new ResponseEntity<>(mockFilms(title), HttpStatus.OK);
    }

    private Films mockFilms(String title) {
        Films films = new Films();
        Film film = new Film();
        film.setTitle(title);
        films.setResults(List.of(film));
        return films;
    }
}