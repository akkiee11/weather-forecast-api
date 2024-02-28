package com.assesment.weatherapp.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserCredsDto{
    private String email;
    private String password;
}
