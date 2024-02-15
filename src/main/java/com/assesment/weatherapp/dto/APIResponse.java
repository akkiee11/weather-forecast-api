package com.assesment.weatherapp.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class APIResponse {
    private String status;
    private Integer statusCode;
    private ForecastResponse data;
    private String error;

}
