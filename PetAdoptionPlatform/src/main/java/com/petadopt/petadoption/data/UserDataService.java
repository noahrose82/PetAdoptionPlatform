package com.petadopt.petadoption.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petadopt.petadoption.data.entity.UserEntity;
import com.petadopt.petadoption.data.repository.UserRepository;

@Service
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

	public UserEntity findByUsername(String username) {
		
		return userRepo.findByUsername(username);
	}
	
	public UserEntity createUser(UserEntity newUser) {

		return userRepo.save(newUser);
	}
}
