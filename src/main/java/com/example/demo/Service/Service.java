package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public String getHomeMessage() {
        return "Hello Spring Boot (from Service Layer)";
    }

    public String getContactMessage() {
        return "This is the Contact Page (from Service Layer)";
    }
}
