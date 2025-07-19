/**
 * Entity class representing a User in the pet adoption platform.
 * Contains user details such as ID, username, password, and roles.
 */
package com.petadopt.petadoption.data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("users")
/**
 * Represents a user in the system.
 */
/** Method */
    public class UserEntity {
	
	@Id
	/** Field */
    private Integer id;
	
	@Column("first_name")
	/** Field */
    private String firstName;
	
	@Column("last_name")
	/** Field */
    private String lastName;
	
	@Column("username")
	/** Field */
    private String username;
	
	@Column("password")
	/** Field */
    private String password;
	
	@Column("email")
	/** Field */
    private String email;
	
	@Column("phone_number")
	/** Field */
    private String phoneNumber;
	
	@Column("role")
	/** Field */
    private String role;
	
	/** Method */
    public UserEntity(Integer id, String firstName, String lastName, String username, String password, String email,
			String phoneNumber, String role) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.role = role;
	}

	/** Method */
    public Integer getId() {
		return id;
	}

	/** Method */
    public void setId(Integer id) {
		this.id = id;
	}

	/** Method */
    public String getFirstName() {
		return firstName;
	}

	/** Method */
    public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/** Method */
    public String getLastName() {
		return lastName;
	}

	/** Method */
    public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/** Method */
    public String getUsername() {
		return username;
	}

	/** Method */
    public void setUsername(String username) {
		this.username = username;
	}

	/** Method */
    public String getPassword() {
		return password;
	}

	/** Method */
    public void setPassword(String password) {
		this.password = password;
	}

	/** Method */
    public String getEmail() {
		return email;
	}

	/** Method */
    public void setEmail(String email) {
		this.email = email;
	}

	/** Method */
    public String getPhoneNumber() {
		return phoneNumber;
	}

	/** Method */
    public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/** Method */
    public String getRole() {
		return role;
	}

	/** Method */
    public void setRole(String role) {
		this.role = role;
	}
}
