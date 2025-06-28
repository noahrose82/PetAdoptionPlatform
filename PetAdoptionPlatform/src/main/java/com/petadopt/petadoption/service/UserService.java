package com.petadopt.petadoption.service;

import com.petadopt.petadoption.data.UserDataService;
import com.petadopt.petadoption.data.entity.UserEntity;
import com.petadopt.petadoption.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

@Service
public class UserService {
	
	@Autowired
	private UserDataService service;
    
	// Method to handle register functionality
	public UserEntity register(User user) {
		
		UserEntity newUser = new UserEntity(
									null,
									user.getFirstName(),
									user.getLastName(),
									user.getUsername(),
									user.getPassword(),
									user.getEmail(),
									user.getPhoneNumber(),
									user.getRole()
									);
									
		return service.createUser(newUser);
	}
	
    // Method to handle login functionality
	public boolean login(User user) {
		
		UserEntity userCreds = service.findByUsername(user.getUsername());
		
		return userCreds.getPassword().equals(user.getPassword());
	}
}