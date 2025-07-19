/**
 * Controller class for handling HTTP requests related to user operations.
 * Provides endpoints for creating, updating, and viewing users.
 */
package com.petadopt.petadoption.controller;

import com.petadopt.petadoption.data.entity.UserEntity;
import com.petadopt.petadoption.model.User;
import com.petadopt.petadoption.service.SecurityService;
import com.petadopt.petadoption.service.UserService;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
//Main class for handling user-related actions
/**
 * Controller for user-related web actions.
 */
/** Method */
    public class UserController {
    
    @Autowired
    UserService service;
    
    @Autowired
    /** Field */
    private SecurityService security;

    @GetMapping("/register")
    /** Method */
    public String displayRegistration(Model model) {
        model.addAttribute("user", new User(null, null, null, null, null, null, null));
        return "register";
    }

   	@PostMapping("/doRegister")
    /** Method */
    public String doRegister(@Valid User user, BindingResult bindingResult, Model model) {
        
        if (bindingResult.hasErrors()) {
            return "register";
        }
        
        UserEntity newUser = service.register(user);
        return "redirect:/login";
    }
    
 /*   
 	@PostMapping("/doLogin")
    /** Method */
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
