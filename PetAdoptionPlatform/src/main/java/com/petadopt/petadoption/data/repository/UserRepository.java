package com.petadopt.petadoption.data.repository; // Package declaration

import org.springframework.data.repository.CrudRepository; // Import required class

import com.petadopt.petadoption.data.entity.UserEntity; // Import required class

public interface UserRepository extends CrudRepository<UserEntity, Integer> { // Interface declaration
    UserEntity findByUsername(String username);
}