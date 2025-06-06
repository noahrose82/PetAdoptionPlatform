package com.petadopt.petadoption.controller;

import com.petadopt.petadoption.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/register")
    public String displayRegistration(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

   	@PostMapping("/doRegister")
    public String doRegister(User user, BindingResult bingingResult, Model model) {
        
        return "redirect:/user/login";
    }
    
    @GetMapping("/login")
    public String displayLogin(Model model) {
        model.addAttribute("loginUser", new User());
        return "login";
    }
    
    @PostMapping("/doLogin")
    public String doLogin(User user, BindingResult bingingResult, Model model) {
        String username = "a";
        String password = "1";

        if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
            return "redirect:/dashboard/loggedin";
        }
        
        else {
        	return "redirect:/user/login";
        }
    }
}