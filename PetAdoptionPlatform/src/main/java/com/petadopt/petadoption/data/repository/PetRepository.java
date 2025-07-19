/**
 * Repository interface for accessing and managing Pet entities.
 * Extends Spring Data's CrudRepository for basic CRUD operations.
 */
package com.petadopt.petadoption.data.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.petadopt.petadoption.data.entity.PetEntity;

/**
 * Defines pet-related data operations.
 */
/** Method */
    public interface PetRepository extends CrudRepository<PetEntity, Integer> {
}