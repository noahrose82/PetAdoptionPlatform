package com.petadopt.petadoption.service;

import com.petadopt.petadoption.model.Register;
import com.petadopt.petadoption.model.User;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

@Service
public class UserService {

	public void register(Register register) {
		
		System.out.print("Username: " + register.getUsername() + "\nPassword: " + register.getPassword() + "\n");
	}
}