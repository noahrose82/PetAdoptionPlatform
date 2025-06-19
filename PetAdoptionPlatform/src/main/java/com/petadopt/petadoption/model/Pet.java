package com.petadopt.petadoption.model; // Package declaration

import jakarta.validation.constraints.NotNull; // Import required class
import jakarta.validation.constraints.Size; // Import required class
/*import jakarta.persistence.*;*/
import lombok.AllArgsConstructor; // Import required class
import lombok.Data; // Import required class
import lombok.NoArgsConstructor; // Import required class

@Data // Annotation
@NoArgsConstructor // Annotation
@AllArgsConstructor // Annotation
/*@Entity*/
public class Pet { // Class declaration

	private int id;
	
	@NotNull(message="Name is a required field") // Annotation
    @Size(min=3, max=20, message="Name must be between 3 and 20 characters") // Annotation
    private String name;
    private int age;
    private String breed;
    private String size;
    
    @NotNull(message="Sex is a required field") // Annotation
    @Size(min=1, max=10, message="Sex must be between 1 and 10 characters") // Annotation
    private String sex;

/*    @Column(length = 1000)*/
    private String description;
    
    @NotNull(message="Adoption Status is a required field") // Annotation
    @Size(min=1, message="Adoption Status must have at least 1 character") // Annotation
    private String adoptionStatus; // Available, Pending, Adopted
    
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
	
	public int getId() {
		return id;
	}

	public void setId(int id) { // Method definition
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) { // Method definition
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) { // Method definition
		this.age = age;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) { // Method definition
		this.breed = breed;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) { // Method definition
		this.size = size;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String gender) { // Method definition
		this.sex = gender;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) { // Method definition
		this.description = description;
	}

	public String getAdoptionStatus() {
		return adoptionStatus;
	}

	public void setAdoptionStatus(String adoptionStatus) { // Method definition
		this.adoptionStatus = adoptionStatus;
	}
    
    
}