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

	// get all
	public List<Pet> getPets() {
		
		List<PetEntity> petsEntity = service.findAll();
		
		List<Pet> petsDomain = new ArrayList<Pet>();
		for(PetEntity e : petsEntity) {
			petsDomain.add(new Pet(
				e.getId(), 
				e.getName(), 
				e.getAge(), 
				e.getBreed(), 
				e.getSize(), 
				e.getSex(), 
				e.getDescription(), 
				e.getAdoptionStatus()
				));
		}
		
		return petsDomain;
	}
	
	// get one
	public Pet getPetById(int id) {
		PetEntity tgtPet = service.findById(id);
		return new Pet(
			tgtPet.getId(), 
			tgtPet.getName(), 
			tgtPet.getAge(), 
			tgtPet.getBreed(), 
			tgtPet.getSize(), 
			tgtPet.getSex(), 
			tgtPet.getDescription(), 
			tgtPet.getAdoptionStatus()
		);
		
		
	}

	// create
	public void addPet(Pet pet) {
		PetEntity newPet = new PetEntity(
			null,
			pet.getName(),
			pet.getAge(),
			pet.getBreed(), 
			pet.getSize(), 
			pet.getSex(), 
			pet.getDescription(), 
			pet.getAdoptionStatus()
			);
		
		service.create(newPet);
    }
	
	// update
	public void updatePet(Pet pet) {
		PetEntity updatedPet = new PetEntity(
			pet.getId(),
			pet.getName(),
			pet.getAge(), 
			pet.getBreed(), 
			pet.getSize(), 
			pet.getSex(), 
			pet.getDescription(), 
			pet.getAdoptionStatus()
		);
		
		service.update(updatedPet);
	}
	
	// delete
    public void deletePet(Pet pet) {
		PetEntity deleteTgt = new PetEntity(
			pet.getId(),
			pet.getName(),
			pet.getAge(), 
			pet.getBreed(), 
			pet.getSize(), 
			pet.getSex(), 
			pet.getDescription(), 
			pet.getAdoptionStatus()
		);
		
		service.delete(deleteTgt);
	}
}