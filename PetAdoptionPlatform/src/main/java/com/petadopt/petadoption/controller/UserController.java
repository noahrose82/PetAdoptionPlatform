package com.petadopt.petadoption.controller; // Package declaration

import com.petadopt.petadoption.data.entity.UserEntity; // Import required class
import com.petadopt.petadoption.model.User; // Import required class
import com.petadopt.petadoption.service.SecurityService; // Import required class
import com.petadopt.petadoption.service.UserService; // Import required class

import jakarta.validation.Valid; // Import required class

import org.springframework.beans.factory.annotation.Autowired; // Import required class
import org.springframework.stereotype.Controller; // Import required class
import org.springframework.ui.Model; // Import required class
import org.springframework.validation.BindingResult; // Import required class
import org.springframework.web.bind.annotation.*; // Import required class

@Controller // Annotation
@RequestMapping("/user") // Annotation
public class UserController { // Class declaration
    
    @Autowired // Annotation
    UserService service;
    
    @Autowired // Annotation
    private SecurityService security;

    @GetMapping("/register") // Annotation
    public String displayRegistration(Model model) {
        model.addAttribute("user", new User(null, null, null, null, null, null, null));
        return "register";
    }

   	@PostMapping("/doRegister") // Annotation
    public String doRegister(@Valid User user, BindingResult bindingResult, Model model) {
        
        if (bindingResult.hasErrors()) {
            return "register";
        }
        
        
        UserEntity newUser = service.register(user);
        return "redirect:/user/login";
    }
    
    @GetMapping("/login") // Annotation
    public String displayLogin(Model model) {
        model.addAttribute("loginUser", new User(null, null, null, null, null, null, null));
        return "login";
    }
    
    @PostMapping("/doLogin") // Annotation
    public String doLogin(User user, BindingResult bindingResult, Model model) {

	    boolean loginFailed = false;
	
	    if (service.login(user)) {
	        return "redirect:/dashboard/loggedin";
	        
	    } else {
	        loginFailed = true;
	    }
	
	    model.addAttribute("loginFailed", loginFailed);
	    model.addAttribute("loginUser", new User(null, null, null, null, null, null, null));
	    return "login";
    }
}