package com.testingForLesson.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping
    public String getString() {
        return "Software is working";
    }

    @GetMapping("/second")
    public String getOneMoreString() {
        return "sdfgsdfgsdfgsdfgsdfgsdfgsdfgsdfgsdfg";
    }
}
