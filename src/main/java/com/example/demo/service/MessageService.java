package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public String message(String name) {
        return "Hello, " + name;
    }

}
