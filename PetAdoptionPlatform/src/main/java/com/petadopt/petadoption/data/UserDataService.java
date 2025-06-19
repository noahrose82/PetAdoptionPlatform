package com.petadopt.petadoption.data; // Package declaration

import java.util.ArrayList; // Import required class
import java.util.List; // Import required class

import org.springframework.beans.factory.annotation.Autowired; // Import required class
import org.springframework.stereotype.Service; // Import required class

import com.petadopt.petadoption.data.entity.UserEntity; // Import required class
import com.petadopt.petadoption.data.repository.UserRepository; // Import required class

@Service // Annotation
public class UserDataService { // Class declaration

	@Autowired // Annotation
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
