package com.petadopt.petadoption.model; // Package declaration

import jakarta.validation.constraints.NotNull; // Import required class
import jakarta.validation.constraints.Size; // Import required class
import lombok.AllArgsConstructor; // Import required class
import lombok.Data; // Import required class
import lombok.NoArgsConstructor; // Import required class

@Data // Annotation
@NoArgsConstructor // Annotation
@AllArgsConstructor // Annotation
public class User { // Class declaration
	
	
    private String firstName;
    private String lastName;
    
    @NotNull(message="Username is a required field") // Annotation
    @Size(min=5, max=20, message="Username must be between 5 and 20 characters") // Annotation
    private String username;
    
    @NotNull(message="Password is a required field") // Annotation
    @Size(min=3, max=15, message="Password must be between 3 and 15 characters") // Annotation
    private String password;
    
    private String email;
    private String phoneNumber;
    private String role; // USER or ADMIN

	public User(
        	String firstName, String lastName,
			@NotNull(message = "Username is a required field") @Size(min = 5, max = 20, message = "Username must be between 5 and 20 characters") String username, // Annotation
			@NotNull(message = "Password is a required field") @Size(min = 3, max = 15, message = "Password must be between 3 and 15 characters") String password, // Annotation
			String email, String phoneNumber, String role) {
                
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.role = role;
	}

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) { // Method definition
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) { // Method definition
        this.lastName = lastName;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) { // Method definition
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) { // Method definition
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) { // Method definition
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) { // Method definition
        this.phoneNumber = phoneNumber;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) { // Method definition
        this.role = role;
    }
}