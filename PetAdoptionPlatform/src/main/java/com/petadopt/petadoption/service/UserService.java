package com.petadopt.petadoption.service; // Package declaration

import com.petadopt.petadoption.data.UserDataService; // Import required class
import com.petadopt.petadoption.data.entity.UserEntity; // Import required class
import com.petadopt.petadoption.model.User; // Import required class

import org.springframework.beans.factory.annotation.Autowired; // Import required class
import org.springframework.stereotype.Service; // Import required class
import org.springframework.ui.Model; // Import required class
import org.springframework.validation.BindingResult; // Import required class

@Service // Annotation
public class UserService { // Class declaration
	
	@Autowired // Annotation
	private UserDataService service;

	public UserEntity register(User user) {
		
		UserEntity newUser = new UserEntity(
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
	
	public boolean login(User user) {
		
		UserEntity userCreds = service.findByUsername(user.getUsername());
		
		return userCreds.getPassword().equals(user.getPassword());
	}
}