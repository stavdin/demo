package com.example.demo.controller;


import com.example.demo.service.PowerMathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PowerMathController {

    @Autowired
    private PowerMathService service;

    @GetMapping("/num/{num}")
    public int  powerMath(@PathVariable int  num){
        return service.powerMath(num);
    }

}
