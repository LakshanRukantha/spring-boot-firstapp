package com.helloworld.firstapp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String helloHandler() {
        return "<h1>Hello World!</h1>";
    }
}
