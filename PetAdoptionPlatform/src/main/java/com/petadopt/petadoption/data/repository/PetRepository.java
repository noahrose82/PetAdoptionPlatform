package com.petadopt.petadoption.data.repository; // Package declaration

import java.util.List; // Import required class

import org.springframework.data.repository.CrudRepository; // Import required class

import com.petadopt.petadoption.data.entity.PetEntity; // Import required class

public interface PetRepository extends CrudRepository<PetEntity, Integer> { // Interface declaration
}