package com.petadopt.petadoption.data.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import com.petadopt.petadoption.data.entity.PetEntity;

public class PetRowMapper implements RowMapper<PetEntity> {

	@Override
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
