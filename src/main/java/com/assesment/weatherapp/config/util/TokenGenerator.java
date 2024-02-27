package com.assesment.weatherapp.config.util;

import com.assesment.weatherapp.constants.SecurityConstants;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TokenGenerator {

    public String generateToken(Authentication authentication) {
        String username= authentication.getName();
        Date currentDate = new Date();
        Date expiryDate = new Date(currentDate.getTime()+ SecurityConstants.JWT_EXPIRATION);

        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(currentDate)
                .setExpiration(expiryDate)
                .signWith(SignatureAlgorithm.HS256, SecurityConstants.JWT_SECERT)
                .compact();
    }

    public String getUsernameFromJWT(String token) {
        Claims claims = Jwts.parser()
                .setSigningKey(SecurityConstants.JWT_SECERT)
                .parseClaimsJws(token)
                .getBody();
        return claims.getSubject();
    }

    public boolean validateToken(String token) {
        try {
            Jwts.parser().setSigningKey(SecurityConstants.JWT_SECERT).parseClaimsJws(token);
            return true;
        }
        catch (Exception ex) {
            throw new AuthenticationCredentialsNotFoundException("JWT token is not valid " + token);
        }
    }
}
