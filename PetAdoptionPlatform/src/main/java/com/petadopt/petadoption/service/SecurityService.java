package com.petadopt.petadoption.service; // Package declaration

import org.springframework.stereotype.Service; // Import required class

@Service // Annotation
public class SecurityService { // Class declaration
	
	public boolean authenticate(String username, String password) {
		
		String correctUN = "username";
		String correctPW = "password";
		
		return correctUN.equals(username) && correctPW.equals(password);
	}
}
