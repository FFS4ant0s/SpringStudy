package com.example.springstudy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springstudy.domain.User;
import com.example.springstudy.service.HelloWorldService;


@RestController
@RequestMapping("/hello-world")
public class HelloController {
    
    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    public String helloworld() {
    return "Hello world";
    }

    @PostMapping
    public String helloWorldPost(@RequestBody User body) {
        return "Hello world " + body.getName();
    }
}
