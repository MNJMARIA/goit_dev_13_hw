package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class TestController {
    @GetMapping(value = "/test")
    public void test(){
        System.out.println("TEST");
    }
}
