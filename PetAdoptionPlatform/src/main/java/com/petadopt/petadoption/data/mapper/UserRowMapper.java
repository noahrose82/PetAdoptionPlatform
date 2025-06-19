package com.petadopt.petadoption.data.mapper; // Package declaration

import java.sql.ResultSet; // Import required class
import java.sql.SQLException; // Import required class

import org.springframework.jdbc.core.RowMapper; // Import required class
import org.springframework.lang.Nullable; // Import required class

import com.petadopt.petadoption.data.entity.UserEntity; // Import required class

public class UserRowMapper implements RowMapper<UserEntity> { // Class declaration

	@Override // Annotation
	@Nullable // Annotation
	public UserEntity mapRow(ResultSet rs, int rowNum) throws SQLException {

		return new UserEntity(
			rs.getString("first_name"), 
			rs.getString("last_name"), 
			rs.getString("username"), 
			rs.getString("password"), 
			rs.getString("email"), 
			rs.getString("phone_number"), 
			rs.getString("role")
		);
	}

}
