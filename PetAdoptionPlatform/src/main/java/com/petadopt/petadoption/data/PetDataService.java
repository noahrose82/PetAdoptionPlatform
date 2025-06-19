package com.petadopt.petadoption.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petadopt.petadoption.data.entity.PetEntity;
import com.petadopt.petadoption.data.repository.PetRepository;

@Service
public class PetDataService implements DataAccessInterface {

	@Autowired
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

	@Override
	public boolean create(Object t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Object t, int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
