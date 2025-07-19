/**
 * Entity class representing the Pet table in the database.
 * Used for ORM mapping and database persistence.
 */
package com.petadopt.petadoption.data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Table("pets")
/**
 * JPA Entity for pet data.
 */
/** Method */
    public class PetEntity {

	@Id
	/** Field */
    private Integer id;
	
	@Column("name")
	/** Field */
    private String name;
	
	@Column("age")
    /** Field */
    private int age;
    
    @Column("breed")
    /** Field */
    private String breed;
    
    @Column("size")
    /** Field */
    private String size;
    
    @Column("sex")
	/** Field */
    private String sex;
	
	@Column("description")
	/** Field */
    private String description;
	
	@Column("adoption_status")
    /** Field */
    private String adoptionStatus; // Available, Pending, Adopted

	/** Method */
    public PetEntity(Integer id, String name, int age, String breed, String size, String sex, String description,
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

	/** Method */
    public Integer getId() {
		return id;
	}

	/** Method */
    public void setId(Integer id) {
		this.id = id;
	}

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
    public void setSex(String sex) {
		this.sex = sex;
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
		return "PetEntity [id=" + id + ", name=" + name + ", age=" + age + ", breed=" + breed + ", size=" + size
				+ ", sex=" + sex + ", description=" + description + ", adoptionStatus=" + adoptionStatus + "]";
	}

	
}
