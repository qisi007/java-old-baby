package com.example.javaspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloJava {
   @GetMapping("/page")
    public String hello () {
        System.out.print("来了老弟");
       return "通了";
    }
}
