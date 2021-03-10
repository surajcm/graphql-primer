package com.suraj.api.film.exception;

import org.springframework.http.HttpStatus;

public class PrimerException extends RuntimeException {
    static final long serialVersionUID = 1L;
    private final String errorMessage;
    private final HttpStatus status;

    public PrimerException(final String errorMessage, final HttpStatus status) {
        super();
        this.errorMessage = errorMessage;
        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
