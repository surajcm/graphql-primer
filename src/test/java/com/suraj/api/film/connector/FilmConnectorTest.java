package com.suraj.api.film.connector;

import com.suraj.api.film.exception.PrimerException;
import com.suraj.api.model.response.Film;
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
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

class FilmConnectorTest {
    @InjectMocks
    private FilmConnector filmConnector;

    @Mock
    private RestTemplate restTemplate;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void validateGetFilmById() {
        String title = "The Empire Strikes Back";
        when(restTemplate.exchange(anyString(), any(HttpMethod.class), any(HttpEntity.class), any(Class.class)))
                .thenReturn(mockResponseEntity(title));
        Film film = filmConnector.getFilmById(1L);
        Assertions.assertEquals(film.getTitle(), title);
    }

    @Test
    public void validateGetFilmByIdError() {
        when(restTemplate.exchange(anyString(), any(HttpMethod.class), any(HttpEntity.class), any(Class.class)))
                .thenThrow(new HttpClientErrorException(HttpStatus.BAD_REQUEST));
        Assertions.assertThrows(PrimerException.class, () -> filmConnector.getFilmById(1L));
    }

    private ResponseEntity<Film> mockResponseEntity(String title) {
        return new ResponseEntity<>(mockFilm(title), HttpStatus.OK);
    }

    private Film mockFilm(String title) {
        Film film = new Film();
        film.setTitle(title);
        return film;
    }
}