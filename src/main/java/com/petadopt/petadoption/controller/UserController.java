package com.petadopt.petadoption.controller;

import com.petadopt.petadoption.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {
    
    

    @GetMapping("/register")
    public String display(Model model) {
        model.addAttribute("title", "Registration Form");
        model.addAttribute("user", new User());
        return "register";
    }

/*    @PostMapping("/register")
    public String processRegistration(@ModelAttribute User user) {
        return "redirect:/login";
    }*/
}