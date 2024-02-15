package com.assesment.weatherapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Precipitation {
    private double sum;
    private int probability;
    private double sumAsRain;
    @JsonProperty("class")
    private int classValue;
}
