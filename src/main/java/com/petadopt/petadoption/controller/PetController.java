/*package com.petadopt.petadoption.controller;

import com.petadopt.petadoption.model.Pet;
import com.petadopt.petadoption.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/pets")
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping
    public String listPets(Model model) {
        List<Pet> pets = petService.getAllPets();
        model.addAttribute("pets", pets);
        return "pets/list"; // thymeleaf page
    }

    @GetMapping("/{id}")
    public String petDetails(@PathVariable Long id, Model model) {
        Pet pet = petService.getPetById(id).orElse(null);
        model.addAttribute("pet", pet);
        return "pets/detail";
    }

    @GetMapping("/create")
    public String createPetForm(Model model) {
        model.addAttribute("pet", new Pet());
        return "pets/create";
    }

    @PostMapping
    public String savePet(@ModelAttribute Pet pet) {
        petService.savePet(pet);
        return "redirect:/pets";
    }

    @GetMapping("/delete/{id}")
    public String deletePet(@PathVariable Long id) {
        petService.deletePet(id);
        return "redirect:/pets";
    }
}*/