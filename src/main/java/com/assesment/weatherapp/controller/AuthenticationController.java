package com.assesment.weatherapp.controller;


import com.assesment.weatherapp.config.util.TokenGenerator;
import com.assesment.weatherapp.dto.AuthTokenResponse;
import com.assesment.weatherapp.dto.UserCredsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthenticationController {

    @Autowired
    private TokenGenerator tokenGenerator;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/authenticate")
    public ResponseEntity<?> authenticateUser(@RequestBody UserCredsDto userCredsDto) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(userCredsDto.getEmail(), userCredsDto.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = tokenGenerator.generateToken(authentication);
        AuthTokenResponse authTokenResponse = AuthTokenResponse.builder().statusCode(HttpStatus.OK.value()).status(HttpStatus.OK.name()).token(token).build();
        return ResponseEntity.ok(authTokenResponse);
    }
}
