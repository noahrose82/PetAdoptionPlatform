package com.petadopt.petadoption.model;

/*import jakarta.persistence.*;*/
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
/*@Entity*/
public class Pet {

/*    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)*/
    private int id;

    private String name;
    private int age;
    private String breed;
    private String size;
    private String gender;

/*    @Column(length = 1000)*/
    private String description;
    private String adoptionStatus; // Available, Pending, Adopted
    
	public Pet(int i, String name, int age, String breed, String size, String gender, String description,
			String adoptionStatus) {
		this.id = i;
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.size = size;
		this.gender = gender;
		this.description = description;
		this.adoptionStatus = adoptionStatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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