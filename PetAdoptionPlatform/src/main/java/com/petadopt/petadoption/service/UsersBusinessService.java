/**
 * Service class handling the business logic for user-related operations.
 * Acts as an intermediary between the data access layer and controllers.
 */
package com.petadopt.petadoption.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.petadopt.petadoption.data.UserDataService;
import com.petadopt.petadoption.data.entity.UserEntity;


@Service
/**
 * Business service for handling user operations.
 */
/** Method */
    public class UsersBusinessService implements UserDetailsService {

	@Autowired
	UserDataService service;
	
	@Override
	/** Method */
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		UserEntity user = service.findByUsername(username);
		if (user != null) {
			
			List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
			authorities.add(new SimpleGrantedAuthority("USER"));
			return new User(user.getUsername(), user.getPassword(), authorities);
			
		} else {
			throw new UsernameNotFoundException("username not found");
		}
	}

}
