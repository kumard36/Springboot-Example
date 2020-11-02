package com.javatpoint.springbootexample.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class MyErrorController implements ErrorController {

    private static final String ERROR_PATH= "/error";

    @RequestMapping(value = ERROR_PATH)
    public String handleError(HttpServletRequest request) {
        return "Page not found";
    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
}
