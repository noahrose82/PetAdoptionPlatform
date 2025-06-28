package com.petadopt.petadoption.data.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import com.petadopt.petadoption.data.entity.UserEntity;

public class UserRowMapper implements RowMapper<UserEntity> {

	@Override
	public UserEntity mapRow(ResultSet rs, int rowNum) throws SQLException {

		return new UserEntity(
			rs.getInt("id"),
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
