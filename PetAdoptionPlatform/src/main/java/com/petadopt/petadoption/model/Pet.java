package com.petadopt.petadoption.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
/*import jakarta.persistence.*;*/
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
/*@Entity*/
public class Pet {

	@NotNull(message="Name is a required field")
    @Size(min=3, max=20, message="Name must be between 3 and 20 characters")
    private String name;
    private int age;
    private String breed;
    private String size;
    
    @NotNull(message="Sex is a required field")
    @Size(min=1, max=10, message="Sex must be between 1 and 10 characters")
    private String sex;

/*    @Column(length = 1000)*/
    private String description;
    
    @NotNull(message="Adoption Status is a required field")
    @Size(min=1, message="Adoption Status must have at least 1 character")
    private String adoptionStatus; // Available, Pending, Adopted
    
	public Pet(String name, int age, String breed, String size, String sex, String description,
			String adoptionStatus) {
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.size = size;
		this.sex = sex;
		this.description = description;
		this.adoptionStatus = adoptionStatus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String gender) {
		this.sex = gender;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAdoptionStatus() {
		return adoptionStatus;
	}

	public void setAdoptionStatus(String adoptionStatus) {
		this.adoptionStatus = adoptionStatus;
	}
    
    
}