package com.manishankar_377.calculatorapplication.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/system")
public class SystemController {

    @GetMapping("/health")
    public String healthCheck() {
        return "System is up and running!";
    }
    @GetMapping("/version")
    public String systemStatus() {
        return "version 1.0.0";
    }
}
