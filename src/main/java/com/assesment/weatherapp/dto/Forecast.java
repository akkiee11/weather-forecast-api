package com.assesment.weatherapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Forecast {
    private List<ForecastItem> items;
    private String forecastDate;
    private String nextUpdate;
    private String source;
    private String point;
    private String fingerprint;
}
