/**
 * Represents a pet available for adoption.
 * Contains attributes like name, breed, age, and availability.
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
/*@Entity*/
/**
 * Data model for pet information.
 */
/** Method */
    public class Pet {

	/** Field */
    private int id;
	
	@NotNull(message="Name is a required field")
    @Size(min=3, max=20, message="Name must be between 3 and 20 characters")
    /** Field */
    private String name;
    /** Field */
    private int age;
    /** Field */
    private String breed;
    /** Field */
    private String size;
    
    @NotNull(message="Sex is a required field")
    @Size(min=1, max=10, message="Sex must be between 1 and 10 characters")
    /** Field */
    private String sex;

/*    @Column(length = 1000)*/
    /** Field */
    private String description;
    
    @NotNull(message="Adoption Status is a required field")
    @Size(min=1, message="Adoption Status must have at least 1 character")
    /** Field */
    private String adoptionStatus; // Available, Pending, Adopted
    
	/** Method */
    public Pet() {
		this.id = 0;
		this.name = "";
		this.age = 0;
		this.breed = "";
		this.size = "";
		this.sex = "";
		this.description = "";
		this.adoptionStatus = "";
	}
    
	/** Method */
    public Pet(int id, String name, int age, String breed, String size, String sex, String description,
			String adoptionStatus) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.size = size;
		this.sex = sex;
		this.description = description;
		this.adoptionStatus = adoptionStatus;
	}
	 // Method to handle getid functionality
	/** Method */
    public int getId() {
		return id;
	}
    // Method to handle setid functionality

	/** Method */
    public void setId(int id) {
		this.id = id;
	}
	// ... [other getters/setters omitted for brevity]
	/** Method */
    public String getName() {
		return name;
	}

	/** Method */
    public void setName(String name) {
		this.name = name;
	}

	/** Method */
    public int getAge() {
		return age;
	}

	/** Method */
    public void setAge(int age) {
		this.age = age;
	}

	/** Method */
    public String getBreed() {
		return breed;
	}

	/** Method */
    public void setBreed(String breed) {
		this.breed = breed;
	}

	/** Method */
    public String getSize() {
		return size;
	}

	/** Method */
    public void setSize(String size) {
		this.size = size;
	}

	/** Method */
    public String getSex() {
		return sex;
	}

	/** Method */
    public void setSex(String gender) {
		this.sex = gender;
	}

	/** Method */
    public String getDescription() {
		return description;
	}

	/** Method */
    public void setDescription(String description) {
		this.description = description;
	}

	/** Method */
    public String getAdoptionStatus() {
		return adoptionStatus;
	}

	/** Method */
    public void setAdoptionStatus(String adoptionStatus) {
		this.adoptionStatus = adoptionStatus;
	}
    
    @Override
	/** Method */
    public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", age=" + age + ", breed=" + breed + ", size=" + size + ", sex="
				+ sex + ", description=" + description + ", adoptionStatus=" + adoptionStatus + "]";
	}

}