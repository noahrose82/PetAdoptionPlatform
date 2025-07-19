/**
 * Service class responsible for user authentication and security logic.
 * Integrates with Spring Security to manage user login state.
 */
package com.petadopt.petadoption.service;

import org.springframework.stereotype.Service;

@Service
/**
 * Handles login and authentication checks.
 */
/** Method */
    public class SecurityService {
	
	/** Method */
    public boolean authenticate(String username, String password) {
		
		String correctUN = "username";
		String correctPW = "password";
		
		return correctUN.equals(username) && correctPW.equals(password);
	}
}
