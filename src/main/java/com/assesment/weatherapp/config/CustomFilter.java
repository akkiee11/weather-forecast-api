package com.assesment.weatherapp.config;

import com.assesment.weatherapp.dto.APIResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;

import java.io.IOException;



public class CustomFilter extends HttpFilter {

    @Override
    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String clientId = httpRequest.getHeader("client_id");
        String clientSecret = httpRequest.getHeader("client_secret");
        if (clientId != null && clientSecret != null) {
            chain.doFilter(request, response);
        } else {
            HttpServletResponse httpResponse = (HttpServletResponse) response;
            httpResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            APIResponse apiResponse = APIResponse.builder().statusCode(HttpStatus.UNAUTHORIZED.value()).status(HttpStatus.UNAUTHORIZED.name()).error("Headers Missing").build();
            httpResponse.getWriter().write(convertObjectToJson(apiResponse));
            httpResponse.setContentType("application/json");
        }
    }

    private String convertObjectToJson(Object object) throws JsonProcessingException {
        if (object == null) {
            return null;
        }
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(object);
    }
}
