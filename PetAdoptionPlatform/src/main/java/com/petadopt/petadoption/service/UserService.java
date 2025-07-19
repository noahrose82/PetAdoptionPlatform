/**
 * Service class responsible for handling user-related logic,
 * such as creation, retrieval, and authentication.
 */
package com.petadopt.petadoption.service;

import com.petadopt.petadoption.data.UserDataService;
import com.petadopt.petadoption.data.entity.UserEntity;
import com.petadopt.petadoption.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

@Service
/**
 * Provides service methods for user operations.
 */
/** Method */
    public class UserService {
	
	@Autowired
	/** Field */
    private UserDataService service;
    
	// Method to handle register functionality
	/** Method */
    public UserEntity register(User user) {
		
		String encodedPassword = new BCryptPasswordEncoder().encode(user.getPassword());  
		
		UserEntity newUser = new UserEntity(
									null,
									user.getFirstName(),
									user.getLastName(),
									user.getUsername(),
									encodedPassword,
									user.getEmail(),
									user.getPhoneNumber(),
									user.getRole()
									);
									
		return service.createUser(newUser);
	}
	
    // Method to handle login functionality
	/** Method */
    public boolean login(User user) {
		
		UserEntity userCreds = service.findByUsername(user.getUsername());
		
		return userCreds.getPassword().equals(user.getPassword());
	}
}