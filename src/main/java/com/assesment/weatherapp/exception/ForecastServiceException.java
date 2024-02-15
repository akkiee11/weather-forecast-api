package com.assesment.weatherapp.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class ForecastServiceException extends RuntimeException {
    public ForecastServiceException(String message) {
        super(message);
    }

    public ForecastServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}

