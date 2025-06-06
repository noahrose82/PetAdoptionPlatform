package com.petadopt.petadoption.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.petadopt.petadoption.model.Pet;

@Controller
@RequestMapping("/dashboard")
public class MainController {
    
    @GetMapping
    public String display(Model model) {
            
        return "index";
    }
    
    @GetMapping("/loggedin")
    public String displayLoggedIn(Model model) {
        
        List<Pet> pets = new ArrayList<Pet>();
        pets.add(new Pet(1, "Bella", 2, "Labrador Retriever", "Large", "Female", "Energetic, loves to play fetch", "Available"));
        pets.add(new Pet(2, "Oliver", 5, "Domestic Shorthair", "Medium", "Male", "Quiet and affectionate", "Pending"));
        pets.add(new Pet(3, "Daisy", 1, "Siamese", "Small", "Female", "Tiny but full of attitude", "Available"));
        pets.add(new Pet(4, "Max", 4, "Beagle", "Large", "Male", "Intelligent, needs daily exercise", "Adopted"));
        pets.add(new Pet(5, "Luna", 3, "Mixed Breed", "Tiny", "Female", " Very friendly and great with kids", "Available"));
        
        model.addAttribute("title", "List of Pets");
        model.addAttribute("pets", pets);
        
        return "pets";
    }
}