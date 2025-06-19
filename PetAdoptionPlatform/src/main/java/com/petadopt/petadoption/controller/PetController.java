package com.petadopt.petadoption.controller; // Package declaration

import com.petadopt.petadoption.model.Pet; // Import required class
import com.petadopt.petadoption.service.PetService; // Import required class

import jakarta.validation.Valid; // Import required class

import org.springframework.beans.factory.annotation.Autowired; // Import required class
import org.springframework.stereotype.Controller; // Import required class
import org.springframework.ui.Model; // Import required class
import org.springframework.validation.BindingResult; // Import required class
import org.springframework.web.bind.annotation.*; // Import required class

import java.util.List; // Import required class

@Controller // Annotation
@RequestMapping("/pets") // Annotation
public class PetController { // Class declaration

    @Autowired // Annotation
    private PetService petService;

	@GetMapping("/new") // Annotation
	public String displayNewPetForm(Model model) {
        model.addAttribute("pet", new Pet(0, null, 0, null, null, null, null, null));
        return "pet/create";
    }
    
    @PostMapping("/doNew") // Annotation
    public String addPet(@Valid Pet pet, BindingResult bindingResult, Model model) {
        
        if (bindingResult.hasErrors()) {
            return "pet/create";
        }
        
        petService.addPet(pet);
        return "redirect:/pet/new";
    }
}