package com.assesment.weatherapp.service.impl;

import com.assesment.weatherapp.adapter.ForecastAdapter;
import com.assesment.weatherapp.dto.ForecastResponse;
import com.assesment.weatherapp.exception.ForecastServiceException;
import com.assesment.weatherapp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherServiceImpl implements WeatherService {

    @Autowired
    private ForecastAdapter forecastAdapter;

    @Override
    public ForecastResponse getForecastSummaryByCity(String city) {

        ForecastResponse forecastBySummary = forecastAdapter.getForecastBySummary(city);
        if (forecastBySummary == null) {
            throw new ForecastServiceException("No response or empty response body received while fetching forecast summary for " + city);
        }
        return forecastBySummary;
    }

    @Override
    public ForecastResponse getHourlyForecastByCity(String city) {

        ForecastResponse forecastHourly = forecastAdapter.getForecastHourly(city);
        if (forecastHourly == null) {
            throw new ForecastServiceException("No response or empty response body received while fetching forecast hourly for " + city);
        }
        return forecastHourly;

    }
}
