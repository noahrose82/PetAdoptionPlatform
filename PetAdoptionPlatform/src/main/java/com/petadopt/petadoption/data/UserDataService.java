package com.petadopt.petadoption.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petadopt.petadoption.data.entity.UserEntity;
import com.petadopt.petadoption.data.repository.UserRepository;

@Service
//Main class or interface for userdata service operations

public class UserDataService {

	@Autowired
	private UserRepository userRepo;
		
	public UserDataService(UserRepository userRepo) {
			
		this.userRepo = userRepo;
	}
	
	public int getUserId() {
		
		List<UserEntity> users = new ArrayList<UserEntity>();
		
		try {
			Iterable<UserEntity> usersIterable = userRepo.findAll();
			
			usersIterable.forEach(users::add);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		return users.size() + 1;
	}
    // Method to handle findall functionality
	public UserEntity findByUsername(String username) {
		
		return userRepo.findByUsername(username);
	}
	
	public UserEntity createUser(UserEntity newUser) {

		return userRepo.save(newUser);
	}
}
