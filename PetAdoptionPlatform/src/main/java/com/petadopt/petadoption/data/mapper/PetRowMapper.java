package com.petadopt.petadoption.data.mapper; // Package declaration

import java.sql.ResultSet; // Import required class
import java.sql.SQLException; // Import required class

import org.springframework.jdbc.core.RowMapper; // Import required class
import org.springframework.lang.Nullable; // Import required class

import com.petadopt.petadoption.data.entity.PetEntity; // Import required class

public class PetRowMapper implements RowMapper<PetEntity> { // Class declaration

	@Override // Annotation
	public PetEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new PetEntity(
			rs.getInt("id"), 
			rs.getString("name"), 
			rs.getInt("age"), 
			rs.getString("breed"), 
			rs.getString("size"), 
			rs.getString("sex"), 
			rs.getString("description"), 
			rs.getString("adoption_status")
		);
	}

}
