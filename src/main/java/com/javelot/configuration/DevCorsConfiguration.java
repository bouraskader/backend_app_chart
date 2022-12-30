package com.javelot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration
public class DevCorsConfiguration implements WebMvcConfigurer {

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        //config.setAllowCredentials(true);
        config.setAllowedOrigins(List.of("*"));
        config.setAllowedHeaders(List.of("Authorization", "Content-Type", "X-Total-Count"));
        config.setExposedHeaders(List.of("X-Total-Count"));
        config.setAllowedMethods(List.of("*"));
        config.setMaxAge(1800L);
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}
