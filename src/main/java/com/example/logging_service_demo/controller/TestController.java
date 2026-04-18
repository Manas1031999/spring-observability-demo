package com.example.logging_service_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/error")
    public String error() {
        int x = 10 / 0;
        return "OK";
    }
    
    @GetMapping("/array")
    public String arrayError() {
        int[] arr = new int[2];
        return String.valueOf(arr[5]);
    }
    
    @GetMapping("/random")
    public String random() {
        double r = Math.random();

        if (r < 0.3) {
            throw new RuntimeException("Random failure occurred");
        } else if (r < 0.6) {
            int x = 10 / 0;
        } else {
            String s = null;
            s.length();
        }

        return "OK";
    }
}
