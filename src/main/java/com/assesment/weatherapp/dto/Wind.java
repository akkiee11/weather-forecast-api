package com.assesment.weatherapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Wind {
    private String unit;
    private String direction;
    private String text;
    private double avg; // Change this to appropriate type if needed
    private double min;
    private double max;
    private Gusts gusts;
    private boolean significationWind;
}
