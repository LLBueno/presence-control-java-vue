package com.leandro.presencecontrol.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class HelloWorld {
    
    @GetMapping(value="/user")
    public String getHelloWorld(@RequestParam(value="name", defaultValue="World") String name) {
        return String.format("Hello %s", name);
    }
    
}