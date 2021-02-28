package com.suraj.api.film.exception;

import org.springframework.http.HttpStatus;

public class PrimerException extends RuntimeException {
    private final String errorMessage;
    private final String errorCode;
    private final HttpStatus status;

    public PrimerException(final String errorMessage, final HttpStatus status) {
        this.errorMessage = errorMessage;
        this.status = status;
        this.errorCode = null;
    }

    public PrimerException(final String errorCode, final String errorMessage, final HttpStatus status) {
        this.errorMessage = errorMessage;
        this.status = status;
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
