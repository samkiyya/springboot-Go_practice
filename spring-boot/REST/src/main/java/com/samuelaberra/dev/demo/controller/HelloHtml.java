package com.samuelaberra.dev.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloHtml {

    @RequestMapping("/")
    public String hello(){
        return "index.html";
    }
}
