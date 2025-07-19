/**
 * Main controller that handles the application's landing or root endpoints.
 * Provides a central point of routing for basic views or pages.
 */
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
/**
 * Central web controller for the application.
 */
/** Method */
    public class MainController {
    
    @Autowired
    PetService service;
    
    // Method to handle home page display
    @GetMapping
    /** Method */
    public String display(Model model) {
            
        return "index";
    }

}