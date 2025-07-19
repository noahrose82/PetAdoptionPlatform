/**
 * Represents a user of the pet adoption platform.
 * Stores user-specific details such as name, email, and role.
 */
package com.petadopt.petadoption.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
/**
 * Data model for application users.
 */
/** Method */
    public class User {
	
	
    /** Field */
    private String firstName;
    /** Field */
    private String lastName;
    
    @NotNull(message="Username is a required field")
    @Size(min=5, max=20, message="Username must be between 5 and 20 characters")
    /** Field */
    private String username;
    
    @NotNull(message="Password is a required field")
    @Size(min=3, max=15, message="Password must be between 3 and 15 characters")
    /** Field */
    private String password;
    
    /** Field */
    private String email;
    /** Field */
    private String phoneNumber;
    /** Field */
    private String role; // USER or ADMIN

	/** Method */
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
    /** Method */
    public String getFirstName() {
        return this.firstName;
    }
    // Method to handle setfirstname functionality
    /** Method */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    // ... [other getters/setters omitted for brevity]
    /** Method */
    public String getLastName() {
        return this.lastName;
    }

    /** Method */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /** Method */
    public String getUsername() {
        return this.username;
    }

    /** Method */
    public void setUsername(String username) {
        this.username = username;
    }

    /** Method */
    public String getPassword() {
        return this.password;
    }

    /** Method */
    public void setPassword(String password) {
        this.password = password;
    }

    /** Method */
    public String getEmail() {
        return this.email;
    }

    /** Method */
    public void setEmail(String email) {
        this.email = email;
    }

    /** Method */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /** Method */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /** Method */
    public String getRole() {
        return this.role;
    }

    /** Method */
    public void setRole(String role) {
        this.role = role;
    }
}