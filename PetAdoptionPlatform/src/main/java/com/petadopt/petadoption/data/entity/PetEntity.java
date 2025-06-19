package com.petadopt.petadoption.data.entity; // Package declaration

import org.springframework.data.annotation.Id; // Import required class
import org.springframework.data.relational.core.mapping.Column; // Import required class
import org.springframework.data.relational.core.mapping.Table; // Import required class

import lombok.AllArgsConstructor; // Import required class
import lombok.NoArgsConstructor; // Import required class

@NoArgsConstructor // Annotation
@AllArgsConstructor // Annotation
@Table("pets") // Annotation
public class PetEntity { // Class declaration
	
	@Id // Annotation
	private Integer id;
	
	@Column("name") // Annotation
	private String name;
	
	@Column("age") // Annotation
    private int age;
    
    @Column("breed") // Annotation
    private String breed;
    
    @Column("size") // Annotation
    private String size;
    
    @Column("sex") // Annotation
	private String sex;
	
	@Column("description") // Annotation
	private String description;
	
	@Column("adoption_status") // Annotation
    private String adoptionStatus; // Available, Pending, Adopted

	public PetEntity(int id, String name, int age, String breed, String size, String sex, String description,
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) { // Method definition
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

	public void setSex(String sex) { // Method definition
		this.sex = sex;
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
