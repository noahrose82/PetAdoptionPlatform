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
public class PetEntity {

	@Id
	private Integer id;
	
	@Column("name")
	private String name;
	
	@Column("age")
    private int age;
    
    @Column("breed")
    private String breed;
    
    @Column("size")
    private String size;
    
    @Column("sex")
	private String sex;
	
	@Column("description")
	private String description;
	
	@Column("adoption_status")
    private String adoptionStatus; // Available, Pending, Adopted

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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
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
		
	@Override
	public String toString() {
		return "PetEntity [id=" + id + ", name=" + name + ", age=" + age + ", breed=" + breed + ", size=" + size
				+ ", sex=" + sex + ", description=" + description + ", adoptionStatus=" + adoptionStatus + "]";
	}

	
}
