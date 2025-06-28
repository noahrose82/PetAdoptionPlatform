package com.petadopt.petadoption.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.petadopt.petadoption.model.Pet;
import com.petadopt.petadoption.service.PetService;

@Controller
//Main class for handling main page operations
@RequestMapping("/dashboard")
public class MainController {
    
    @Autowired
    PetService service;
    
    // Method to handle home page display
    @GetMapping
    public String display(Model model) {
            
        return "index";
    }
    
    @GetMapping("/loggedin")
    public String displayLoggedIn(Model model) {
        
        List<Pet> pets = service.getPets();
        
        model.addAttribute("title", "List of Pets");
        model.addAttribute("pets", pets);
        
        return "pets";
    }
}