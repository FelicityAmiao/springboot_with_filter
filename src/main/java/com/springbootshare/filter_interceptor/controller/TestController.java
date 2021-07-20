package com.springbootshare.filter_interceptor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("greeting")
    public String saySomething() {
        return "Good Morning!";
    }
}
