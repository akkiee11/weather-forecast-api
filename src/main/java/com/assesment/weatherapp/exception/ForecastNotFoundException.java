package com.assesment.weatherapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ForecastNotFoundException extends RuntimeException {
    public ForecastNotFoundException(String message) {
        super(message);
    }

    public ForecastNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}

