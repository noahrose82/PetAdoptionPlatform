package com.petadopt.petadoption.data; // Package declaration

import java.util.ArrayList; // Import required class
import java.util.List; // Import required class

import org.springframework.beans.factory.annotation.Autowired; // Import required class
import org.springframework.stereotype.Service; // Import required class

import com.petadopt.petadoption.data.entity.PetEntity; // Import required class
import com.petadopt.petadoption.data.repository.PetRepository; // Import required class

@Service // Annotation
public class PetDataService implements DataAccessInterface { // Class declaration

	@Autowired // Annotation
	private PetRepository petRepo;
	
	public PetDataService(PetRepository petRepo) {
		
		this.petRepo = petRepo;
	}

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

		return null;
	}

	@Override // Annotation
	public boolean create(Object t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override // Annotation
	public boolean update(Object t, int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override // Annotation
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
