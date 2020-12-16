package com.example.demo.controller;

import com.example.demo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {

    @Autowired
    private MessageService service;

    @PostMapping("/message/{message}")
    public String echoMessage(@PathVariable String message) {
        return service.message(message);
    }

    @GetMapping("/message/{id}")
    public String readMessage(@PathVariable Long id) {
        return service.readMessage(id);
    }

    @DeleteMapping("/message/{id}")
    public void deleteMessage(@PathVariable Long id) {
        service.deleteMessage(id);
    }

    @PutMapping("/message/{id}")
    public void updateMessage(@PathVariable Long id) {
        service.updateMessage(id);
    }
}

