package com.pulpocon.api.users.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;
@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping("/hello")
    public ResponseEntity<String> helloWorld() throws URISyntaxException {

        return ResponseEntity.ok("Hello world");
    }

}
