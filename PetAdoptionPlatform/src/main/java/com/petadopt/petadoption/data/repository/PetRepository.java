package com.petadopt.petadoption.data.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.petadopt.petadoption.data.entity.PetEntity;

public interface PetRepository extends CrudRepository<PetEntity, Integer> {
}