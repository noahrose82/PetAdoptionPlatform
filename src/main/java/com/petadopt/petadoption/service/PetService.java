package com.petadopt.petadoption.service;

import com.petadopt.petadoption.model.Pet;
import com.petadopt.petadoption.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetService {

    @Autowired
    private PetRepository petRepository;

    public List<Pet> getAllPets() {
        return petRepository.findAll();
    }

    public Optional<Pet> getPetById(Long id) {
        return petRepository.findById(id);
    }

    public Pet savePet(Pet pet) {
        return petRepository.save(pet);
    }

    public void deletePet(Long id) {
        petRepository.deleteById(id);
    }

    public List<Pet> searchByBreed(String breed) {
        return petRepository.findByBreedContainingIgnoreCase(breed);
    }

    public List<Pet> filterByStatus(String status) {
        return petRepository.findByAdoptionStatus(status);
    }
}