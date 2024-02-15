package com.assesment.weatherapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Location {

    private String code;
    private String name;
    private String timezone;
    private Coordinates coordinates;
}
