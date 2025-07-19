/**
 * Controller responsible for managing user login operations.
 * Handles login form display and authentication handling.
 */
package com.petadopt.petadoption.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
/**
 * Login controller for handling authentication UI.
 */
/** Method */
    public class LoginController {
	
	@GetMapping("/login")
	/** Method */
    public String display(Model model) {
		
		model.addAttribute("title", "Login Form");
		return "login";
	}
}