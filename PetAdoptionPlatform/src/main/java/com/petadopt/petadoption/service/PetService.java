package com.petadopt.petadoption.service; // Package declaration

import com.petadopt.petadoption.data.PetDataService; // Import required class
import com.petadopt.petadoption.data.entity.PetEntity; // Import required class
import com.petadopt.petadoption.data.repository.PetRepository; // Import required class
import com.petadopt.petadoption.model.Pet; // Import required class

import org.springframework.beans.factory.annotation.Autowired; // Import required class
import org.springframework.stereotype.Service; // Import required class

import java.util.ArrayList; // Import required class
import java.util.List; // Import required class
import java.util.Optional; // Import required class

@Service // Annotation
public class PetService { // Class declaration
	
	@Autowired // Annotation
	private PetDataService service;

	public List<Pet> getPets() {
		
		List<PetEntity> petsEntity = service.findAll();
		
		List<Pet> petsDomain = new ArrayList<Pet>();
		for(PetEntity e : petsEntity) {
			petsDomain.add(new Pet(e.getId(), e.getName(), e.getAge(), e.getBreed(), e.getSize(), e.getSex(), e.getDescription(), e.getAdoptionStatus()));
		}
		
		return petsDomain;
	}

	public void addPet(Pet pet) { // Method definition
        System.out.println(
            "Name: " + pet.getName() + 
        	"\nAge: " + pet.getAge() + 
        	"\nBreed: " + pet.getBreed() +
        	"\nSize: " + pet.getSize() +
        	"\nSex: " + pet.getSex() +
        	"\nDescription: " + pet.getDescription() +
        	"\nAdoption Status: " + pet.getAdoptionStatus() +
        	"\n"
        	);
    }

	
    
}