package com.example.dockerhelloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HelloWorldController {
    @GetMapping("/get")
    public String sayHello() {
        return "You have build spring-boot application. Now you can run this in Docker as container.";
    }
}
