package com.petadopt.petadoption.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petadopt.petadoption.data.entity.PetEntity;
import com.petadopt.petadoption.data.repository.PetRepository;

@Service
//Main class or interface for petdataservice operations
public class PetDataService implements DataAccessInterface<PetEntity> {

	
	@Autowired
	private PetRepository petRepo;
	
	public PetDataService(PetRepository petRepo) {
		
		this.petRepo = petRepo;
	}
	   // Method to handle findall functionality
	public List<PetEntity> findAll() {
		
		List<PetEntity> pets = new ArrayList<PetEntity>();
		
		try {
			Iterable<PetEntity> petsIterable = petRepo.findAll();
			
			petsIterable.forEach(pets::add);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		return pets;
	}

	public PetEntity findById(int id) {
		Optional<PetEntity> pet = petRepo.findById(id);
		return pet.isPresent() ? pet.get() : null; 
	}

	@Override
	public boolean create(PetEntity newPet) {
		PetEntity resultPet = petRepo.save(newPet);
		return resultPet != null;
	}

	@Override
	public boolean update(PetEntity pet) {
		PetEntity resultPet = petRepo.save(pet);
		return resultPet != null;
	}

	@Override
	public boolean delete(PetEntity pet) {
		petRepo.delete(pet);
		return !petRepo.existsById(pet.getId());
	}
	
	
}
