package com.assesment.weatherapp.controller;

import com.assesment.weatherapp.dto.APIResponse;
import com.assesment.weatherapp.dto.ForecastResponse;
import com.assesment.weatherapp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/forecast/{city}/summary")
    public ResponseEntity<?> getForecastSummary(@PathVariable String city) {
        ForecastResponse forecastSummary = weatherService.getForecastSummaryByCity(city);
        APIResponse apiResponse = APIResponse.builder().statusCode(HttpStatus.OK.value()).status(HttpStatus.OK.name()).data(forecastSummary).build();
        return ResponseEntity.ok(apiResponse);
    }

    @GetMapping("/forecast/{city}/hourly")
    public ResponseEntity<?> getHourlyForecast(@PathVariable String city) {
        ForecastResponse hourlyForecast = weatherService.getHourlyForecastByCity(city);
        APIResponse apiResponse = APIResponse.builder().statusCode(HttpStatus.OK.value()).status(HttpStatus.OK.name()).data(hourlyForecast).build();
        return ResponseEntity.ok(apiResponse);
    }
}
