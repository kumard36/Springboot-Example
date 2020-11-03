package com.javatpoint.springbootexample.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getapi")
public class GetApiExample {
    @GetMapping
    public String hello() {
        return "Hello Divyank";
    }
}
