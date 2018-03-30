package com.example.demo.endpoints.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.json.Json;

@RestController
public class Main {

    @GetMapping
    public String hello() {
        for (int i = 0; i < 1e2; i += 1) {
            Json.createObjectBuilder();
        }

        return "Hello, World!";
    }

}
