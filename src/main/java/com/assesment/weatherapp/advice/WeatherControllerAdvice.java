package com.assesment.weatherapp.advice;

import com.assesment.weatherapp.dto.APIResponse;
import com.assesment.weatherapp.exception.ForecastNotFoundException;
import com.assesment.weatherapp.exception.ForecastServiceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class WeatherControllerAdvice {
    @ExceptionHandler({ForecastNotFoundException.class})
    public final ResponseEntity<?> handleException(Exception ex, WebRequest request) {
        APIResponse apiResponse = APIResponse.builder().statusCode(HttpStatus.BAD_REQUEST.value()).status(HttpStatus.BAD_REQUEST.name()).error(ex.getMessage()).build();
        return ResponseEntity.internalServerError().body(apiResponse);
    }

    @ExceptionHandler({ForecastServiceException.class, Exception.class})
    public final ResponseEntity<?> handleInternalServerException(Exception ex, WebRequest request) {
        APIResponse apiResponse = APIResponse.builder().statusCode(HttpStatus.INTERNAL_SERVER_ERROR.value()).status(HttpStatus.INTERNAL_SERVER_ERROR.name()).error(ex.getMessage()).build();
        return ResponseEntity.internalServerError().body(apiResponse);
    }
}
