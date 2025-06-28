package com.petadopt.petadoption.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	
    private String firstName;
    private String lastName;
    
    @NotNull(message="Username is a required field")
    @Size(min=5, max=20, message="Username must be between 5 and 20 characters")
    private String username;
    
    @NotNull(message="Password is a required field")
    @Size(min=3, max=15, message="Password must be between 3 and 15 characters")
    private String password;
    
    private String email;
    private String phoneNumber;
    private String role; // USER or ADMIN

	public User(
        	String firstName, String lastName,
			@NotNull(message = "Username is a required field") @Size(min = 5, max = 20, message = "Username must be between 5 and 20 characters") String username,
			@NotNull(message = "Password is a required field") @Size(min = 3, max = 15, message = "Password must be between 3 and 15 characters") String password,
			String email, String phoneNumber, String role) {
                
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.role = role;
	}
	// Method to handle getfirstname functionality
    public String getFirstName() {
        return this.firstName;
    }
    // Method to handle setfirstname functionality
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    // ... [other getters/setters omitted for brevity]
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}