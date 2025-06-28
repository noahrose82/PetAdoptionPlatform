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
//Main class for handling pet-related operations
@RequestMapping("/pets")
public class PetController {

    @Autowired
    private PetService petService;

    // Method to display all pets
	@GetMapping("/new")
	public String displayNewPetForm(Model model) {
        model.addAttribute("pet", new Pet(0, null, 0, null, null, null, null, null));
        return "pet/create";
    }
    
    @PostMapping("/doNew")
    public String addPet(@Valid Pet pet, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult.toString());
            return "pet/create";
        }
        
        petService.addPet(pet);
        return "redirect:/pets/new";
    }
    
    @GetMapping("/update/{id}")
    public String displayUpdatePetForm(@PathVariable Integer id, Model model) {
        model.addAttribute("pet", petService.getPetById(id));
        return "pet/update";
    }
    
    @PostMapping("update/doUpdate")
    public String updatePet(@Valid Pet pet, BindingResult bindingResult, Model model) {
        
        if (bindingResult.hasErrors()) {
            return "pet/update";
        }
        
        petService.updatePet(pet);
        return "redirect:/dashboard/loggedin";
    }
    
    @PostMapping("delete/{id}")
    public String deletePet(@PathVariable Integer id, Model model) {
        petService.deletePet(petService.getPetById(id));
        return "redirect:/dashboard/loggedin";
    }
}