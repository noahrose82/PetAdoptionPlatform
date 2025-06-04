package com.petadopt.petadoption.repository;

import com.petadopt.petadoption.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PetRepository extends JpaRepository<Pet, Long> {
    List<Pet> findByAdoptionStatus(String status);
    List<Pet> findByBreedContainingIgnoreCase(String breed);
}