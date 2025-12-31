package org.example.inventory2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {

    @GetMapping
    public ResponseEntity<Map<String, String>> healthcheck() {
        return ResponseEntity.ok().body(Map.of("Status", "Up"));
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring Boot Pipeline!";
    }
}

