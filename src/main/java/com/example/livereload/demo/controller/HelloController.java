package com.example.livereload.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String sayHello() {
        String test = "test";
        String test1 = "test1";
        String test2 = "test2";
        String test3 = "test3";
        return "hello world!!!\n";
    }
}
