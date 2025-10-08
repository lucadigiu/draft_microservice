package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.ServiceImpl;

import lombok.AllArgsConstructor;



@RestController
@AllArgsConstructor
@RequestMapping("api/v1/users")
public class UserController {

    private final ServiceImpl serviceImpl;

    @GetMapping
    public List<User> findAll() {
        return serviceImpl.findAll();
    }
    
}
