package com.petadopt.petadoption.service;

import com.petadopt.petadoption.model.Pet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PetService {

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

    public List<Pet> getPets() {
        List<Pet> pets = new ArrayList<Pet>();
        pets.add(new Pet("Bella", 2, "Labrador Retriever", "Large", "Female", "Energetic, loves to play fetch", "Available"));
        pets.add(new Pet("Oliver", 5, "Domestic Shorthair", "Medium", "Male", "Quiet and affectionate", "Pending"));
        pets.add(new Pet("Daisy", 1, "Siamese", "Small", "Female", "Tiny but full of attitude", "Available"));
        pets.add(new Pet("Max", 4, "Beagle", "Large", "Male", "Intelligent, needs daily exercise", "Adopted"));
        pets.add(new Pet("Luna", 3, "Mixed Breed", "Tiny", "Female", " Very friendly and great with kids", "Available"));
        
        return pets;
    }
    
}