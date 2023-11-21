package com.prowings.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.entity.Demo;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
    @PostMapping("/demo")
    public Demo demo( @RequestBody Demo demo) {
        System.out.println("Received Request: " + demo); // Log the received request body
        // Your controller logic here
        return demo;
    }

}
