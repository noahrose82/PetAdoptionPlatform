/**
 * Data service class for accessing and managing pet data in the database.
 * Works with JDBC or Spring Data repositories to fetch or persist pet information.
 */
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
/**
 * Data access service for pets.
 */
/** Method */
    public class PetDataService implements DataAccessInterface<PetEntity> {

	
	@Autowired
	/** Field */
    private PetRepository petRepo;
	
	/** Method */
    public PetDataService(PetRepository petRepo) {
		
		this.petRepo = petRepo;
	}
	   // Method to handle findall functionality
	/** Method */
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

	/** Method */
    public PetEntity findById(int id) {
		Optional<PetEntity> pet = petRepo.findById(id);
		return pet.isPresent() ? pet.get() : null; 
	}

	@Override
	/** Method */
    public boolean create(PetEntity newPet) {
		PetEntity resultPet = petRepo.save(newPet);
		return resultPet != null;
	}

	@Override
	/** Method */
    public boolean update(PetEntity pet) {
		PetEntity resultPet = petRepo.save(pet);
		return resultPet != null;
	}

	@Override
	/** Method */
    public boolean delete(PetEntity pet) {
		petRepo.delete(pet);
		return !petRepo.existsById(pet.getId());
	}
	
	
}
