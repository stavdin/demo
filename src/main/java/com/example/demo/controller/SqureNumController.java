package com.example.demo.controller;


import com.example.demo.service.SquareNumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SqureNumController {

    @Autowired
    private SquareNumService service;

    @GetMapping("/num/{num}")
    public int squreNum(@PathVariable double num) {
        return service.squareNum(num);
    }

}
