package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestApplication {

    @GetMapping("/")
    public String print() {
        return "Hello World";
    }

}
