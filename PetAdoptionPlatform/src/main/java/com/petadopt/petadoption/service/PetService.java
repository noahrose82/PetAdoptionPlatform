package com.petadopt.petadoption.service;

import com.petadopt.petadoption.data.PetDataService;
import com.petadopt.petadoption.data.entity.PetEntity;
import com.petadopt.petadoption.data.repository.PetRepository;
import com.petadopt.petadoption.model.Pet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PetService {
	
	@Autowired
	private PetDataService service;

	public List<Pet> getPets() {
		
		List<PetEntity> petsEntity = service.findAll();
		
		List<Pet> petsDomain = new ArrayList<Pet>();
		for(PetEntity e : petsEntity) {
			petsDomain.add(new Pet(e.getId(), e.getName(), e.getAge(), e.getBreed(), e.getSize(), e.getSex(), e.getDescription(), e.getAdoptionStatus()));
		}
		
		return petsDomain;
	}

	public void addPet(Pet pet) {
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