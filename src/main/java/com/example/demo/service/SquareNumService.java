package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class SquareNumService {

    public int squareNum(double num) {
        return (int) Math.sqrt(num);
    }

}
