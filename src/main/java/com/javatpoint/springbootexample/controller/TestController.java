package com.javatpoint.springbootexample.controller;

import com.google.gson.Gson;
import com.javatpoint.springbootexample.model.Animal;
import com.javatpoint.springbootexample.utils.RequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
public class TestController {
    Gson gson = new Gson();
    @RequestMapping(method = RequestMethod.POST, value = "/nohomo")
    public String getAnimalType(HttpServletRequest request) throws IOException {
        Animal currentAnimal = gson.fromJson(RequestUtils.getParamsFromPost(request),Animal.class);
        return String.valueOf(currentAnimal.getAnimalProperty().getLifeExpectancy());
    }
}
