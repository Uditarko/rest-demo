package com.example.rest_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping(path = "/ws")
    public Integer addNumbers(@RequestParam("inputOne") Integer inputOne, @RequestParam("inputTwo") Integer inputTwo){
        return inputOne + inputTwo;
    }
}
