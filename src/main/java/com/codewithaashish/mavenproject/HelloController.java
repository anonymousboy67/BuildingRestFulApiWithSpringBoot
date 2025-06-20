package com.codewithaashish.mavenproject;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello! Your first API is working !";
    }


    @GetMapping("/")
    public String home(){
        return "Welcome to user Management API";
    }



}
