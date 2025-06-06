package com.petadopt.petadoption.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/dashboard")
public class MainController {
    
    @GetMapping
    public String display(Model model) {
            
        return "index";
    }
    
    @GetMapping("/loggedin")
    public String displayLoggedIn(Model model) {
        return "index";
    }
}