package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GetController {

    @GetMapping("/")
    public String getMain() {
        return "index";
    }

    @GetMapping("license")
    public String getLicense() { return "license"; }
}

