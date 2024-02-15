package com.assesment.weatherapp.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ForecastItem {
    private String date;
    private int period;
    @JsonProperty("dateWithTimezone")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private String dateWithTimezone;
    private double freshSnow;
    private int snowHeight;
    private Weather weather;
    private Precipitation prec;
    private double sunHours;
    private int rainHours;
    private Temperature temperature;
    private double pressure;
    private boolean isNight;
    private Wind wind;
    private Windchill windchill;
    private SnowLine snowLine;
    private Astronomy astronomy;
    private Clouds clouds;
    private int relativeHumidity;
}
