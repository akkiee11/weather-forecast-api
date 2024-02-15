package com.assesment.weatherapp.adapter;

import com.assesment.weatherapp.dto.ForecastResponse;
import com.assesment.weatherapp.exception.ForecastNotFoundException;
import com.assesment.weatherapp.exception.ForecastServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Component
public class ForecastAdapter {

    @Value("${rapidapi.forecastapi.base-url}")
    String baseUrl;

    @Value("${rapidapi.forecastapi.summary-path}")
    String summaryPath;

    @Value("${rapidapi.forecastapi.hourly-path}")
    String hourlyPath;


    @Value("${rapidapi.api-key}")
    String apiKey;

    @Autowired
    private RestTemplate restTemplate;

    private static final String RAPID_API_KEY_HEADER = "X-RapidAPI-Key";


    public ForecastResponse getForecastBySummary(String city) {
        return getForecast(city, "SUMMARY");
    }

    public ForecastResponse getForecastHourly(String city) {
        return getForecast(city, "HOURLY");
    }


    private ForecastResponse getForecast(String city, String abc) {
        String url;
        if (abc.equals("SUMMARY")) {
            url = baseUrl + summaryPath.replace("{{city}}", city);
        } else {
            url = baseUrl + hourlyPath.replace("{{city}}", city);
        }
        HttpHeaders headers = new HttpHeaders();
        headers.set(RAPID_API_KEY_HEADER, apiKey);
        HttpEntity<String> entity = new HttpEntity<>(headers);
        try {
            ResponseEntity<ForecastResponse> response = restTemplate.exchange(url, HttpMethod.GET, entity, ForecastResponse.class);
            return response.getBody();
        } catch (HttpClientErrorException.NotFound e) {
            throw new ForecastNotFoundException("Forecast for city '" + city + "' not found", e);
        } catch (HttpClientErrorException | HttpServerErrorException e) {
            throw new ForecastServiceException("Error while fetching forecast summary for " + city, e);
        } catch (RestClientException e) {
            throw new ForecastServiceException("Error communicating with the weather service API", e);
        } catch (Exception ex) {
            throw new ForecastServiceException("Unexpected error occurred", ex);
        }
    }
}
