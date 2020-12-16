package com.example.demo.service;

import com.example.demo.entity.Message;
import com.example.demo.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.Instant;

@Service
public class MessageService {

    @Autowired
    private MessageRepository repository;

    public String message(String name) {
        Message message = Message.builder().timestamp(Timestamp.from(Instant.now())).message("Hello, " + name).build();
        Message save = repository.save(message);
        return save.getMessage();
    }

    public String readMessage(Long id) {
        Message read = repository.findById(id).get();
        return read.getMessage();
    }

    public void deleteMessage(Long id) {
        repository.deleteById(id);
    }

    public void updateMessage(Long id) {
        Message message = repository.findById(id).get();
        message.setMessage("Hi");
        repository.save(message);
    }
}
