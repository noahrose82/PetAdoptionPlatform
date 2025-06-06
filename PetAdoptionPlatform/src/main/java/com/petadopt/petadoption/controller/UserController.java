package com.petadopt.petadoption.controller;

import com.petadopt.petadoption.model.Register;
import com.petadopt.petadoption.model.User;

import jakarta.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/register")
    public String displayRegistration(Model model) {
        model.addAttribute("register", new Register(null, null, null, null, null, null, null));
        return "register";
    }

   	@PostMapping("/doRegister")
    public String doRegister(@Valid Register register, BindingResult bindingResult, Model model) {
        
        if (bindingResult.hasErrors()) {
            return "register";
        }
        
        return "redirect:/user/login";
    }
    
    @GetMapping("/login")
    public String displayLogin(Model model) {
        model.addAttribute("loginUser", new User());
        return "login";
    }
    
    @PostMapping("/doLogin")
    public String doLogin(User user, BindingResult bindingResult, Model model) {
        String username = "username";
        String password = "password";

	    boolean loginFailed = false;
	
	    if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
	        return "redirect:/dashboard/loggedin";
	    } else {
	        loginFailed = true;
	    }
	
	    model.addAttribute("loginFailed", loginFailed);
	    model.addAttribute("loginUser", new User());
	    return "login";
    }
}