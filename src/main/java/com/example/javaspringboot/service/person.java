package com.example.javaspringboot.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")

public class person {
    @GetMapping("/getUser")
    public void getUser () {
        System.out.print("张三");
    }
}
