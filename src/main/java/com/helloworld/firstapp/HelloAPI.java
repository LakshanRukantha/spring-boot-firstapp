package com.helloworld.firstapp;

import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloAPI {
    @GetMapping("/hello")
    public Map<String, String> welcomeAPIHandler() {
        return Map.of("message", "Hello Spring Boot!", "name", "Lakshan Rukantha", "date", new Date().toString());
    }

}
