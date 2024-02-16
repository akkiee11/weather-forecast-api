package com.assesment.weatherapp.service.impl;

import com.assesment.weatherapp.adapter.ForecastAdapter;
import com.assesment.weatherapp.dto.ForecastResponse;
import com.assesment.weatherapp.exception.ForecastNotFoundException;
import com.assesment.weatherapp.exception.ForecastServiceException;
import com.assesment.weatherapp.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

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
