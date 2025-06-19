package com.petadopt.petadoption.data.entity; // Package declaration

import org.springframework.data.annotation.Id; // Import required class
import org.springframework.data.relational.core.mapping.Column; // Import required class
import org.springframework.data.relational.core.mapping.Table; // Import required class

@Table("users") // Annotation
public class UserEntity { // Class declaration
	
	@Id // Annotation
	private int id;
	
	@Column("first_name") // Annotation
	private String firstName;
	
	@Column("last_name") // Annotation
	private String lastName;
	
	@Column("username") // Annotation
	private String username;
	
	@Column("password") // Annotation
	private String password;
	
	@Column("email") // Annotation
	private String email;
	
	@Column("phone_number") // Annotation
	private String phoneNumber;
	
	@Column("role") // Annotation
	private String role;
	
	public UserEntity(String firstName, String lastName, String username, String password, String email,
			String phoneNumber, String role) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) { // Method definition
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) { // Method definition
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) { // Method definition
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) { // Method definition
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) { // Method definition
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) { // Method definition
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) { // Method definition
		this.phoneNumber = phoneNumber;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) { // Method definition
		this.role = role;
	}
}
