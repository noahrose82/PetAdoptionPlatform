/**
 * Repository interface for accessing and managing User entities.
 * Provides database operations for user persistence.
 */
package com.petadopt.petadoption.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.petadopt.petadoption.data.entity.UserEntity;

/**
 * Defines user-related data operations.
 */
/** Method */
    public interface UserRepository extends CrudRepository<UserEntity, Integer> {
    UserEntity findByUsername(String username);
}