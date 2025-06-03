package com.lab.employee_service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())         // تعطيل CSRF
            .authorizeHttpRequests(auth -> auth
                .anyRequest().permitAll()         // السماح لكل الطلبات
            );
        return http.build();
    }
}
