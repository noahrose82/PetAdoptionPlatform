package com.petadopt.petadoption.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String display(Model model) {
		
		model.addAttribute("title", "Login Form");
		return "login";
	}
}