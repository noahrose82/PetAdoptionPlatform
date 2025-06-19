package com.petadopt.petadoption.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.petadopt.petadoption.data.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {
    UserEntity findByUsername(String username);
}