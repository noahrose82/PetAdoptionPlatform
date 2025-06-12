package com.petadopt.petadoption.service;

import org.springframework.stereotype.Service;

@Service
public class SecurityService {
	
	public boolean authenticate(String username, String password) {
		
		String correctUN = "username";
		String correctPW = "password";
		
		return correctUN.equals(username) && correctPW.equals(password);
	}
}
