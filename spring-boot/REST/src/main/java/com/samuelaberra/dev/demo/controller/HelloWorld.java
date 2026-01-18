package com.samuelaberra.dev.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    
    @GetMapping("/hello-sam")
    public String helloWorld(){
        return "Hello Sam's World!";
    }
}
