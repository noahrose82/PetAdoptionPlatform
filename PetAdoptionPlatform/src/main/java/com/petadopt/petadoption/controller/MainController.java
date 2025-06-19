package com.petadopt.petadoption.controller; // Package declaration

import java.util.ArrayList; // Import required class
import java.util.List; // Import required class

import org.springframework.beans.factory.annotation.Autowired; // Import required class
import org.springframework.stereotype.Controller; // Import required class
import org.springframework.ui.Model; // Import required class
import org.springframework.web.bind.annotation.GetMapping; // Import required class
import org.springframework.web.bind.annotation.RequestMapping; // Import required class
import org.springframework.web.bind.annotation.ResponseBody; // Import required class

import com.petadopt.petadoption.model.Pet; // Import required class
import com.petadopt.petadoption.service.PetService; // Import required class

@Controller // Annotation
@RequestMapping("/dashboard") // Annotation
public class MainController { // Class declaration
    
    @Autowired // Annotation
    PetService service;
    
    @GetMapping // Annotation
    public String display(Model model) {
            
        return "index";
    }
    
    @GetMapping("/loggedin") // Annotation
    public String displayLoggedIn(Model model) {
        
        List<Pet> pets = service.getPets();
        
        model.addAttribute("title", "List of Pets");
        model.addAttribute("pets", pets);
        
        return "pets";
    }
}