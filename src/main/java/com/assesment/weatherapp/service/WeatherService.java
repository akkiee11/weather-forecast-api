package com.assesment.weatherapp.service;

import com.assesment.weatherapp.dto.ForecastResponse;

public interface WeatherService {
    ForecastResponse getForecastSummaryByCity(String city);

    ForecastResponse getHourlyForecastByCity(String city);
}
