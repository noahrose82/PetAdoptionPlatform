package com.petadopt.petadoption.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/dashboard")
public class MainController {
    
    @GetMapping
    @ResponseBody
        public String getMethodName() {
            return "test";
        }
}