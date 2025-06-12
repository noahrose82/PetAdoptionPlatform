package com.petadopt.petadoption.controller;

import com.petadopt.petadoption.model.Pet;
import com.petadopt.petadoption.service.PetService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/pets")
public class PetController {

    @Autowired
    private PetService petService;

	@GetMapping("/new")
	public String displayNewPetForm(Model model) {
        model.addAttribute("pet", new Pet(null, 0, null, null, null, null, null));
        return "pet/create";
    }
    
    @PostMapping("/doNew")
    public String addPet(@Valid Pet pet, BindingResult bindingResult, Model model) {
        
        if (bindingResult.hasErrors()) {
            return "pet/create";
        }
        
        petService.addPet(pet);
        return "redirect:/pet/new";
    }
}