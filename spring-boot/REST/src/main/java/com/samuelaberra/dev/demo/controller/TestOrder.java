package com.samuelaberra.dev.demo.controller;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class TestOrder {

    @GetMapping("order") 
public String testOrder(@RequestParam String orderItem){
    return "your order of " + orderItem + " has been placed.";
}
    
}
