package com.javatpoint.springbootexample.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/currentUTC")
public class ServiceCounter {
    private static long counter = 0;

    private static long count() {
        counter++;
        return counter;
    }

    private String nowTime() {
        String currentDateTime = ZonedDateTime.now(ZoneOffset.UTC).format(DateTimeFormatter.ISO_INSTANT);
        return currentDateTime;
    }

    @GetMapping
    public String pageData() {
        return "count: " + count() + "<br>" + "time: " + nowTime();
    }
}
