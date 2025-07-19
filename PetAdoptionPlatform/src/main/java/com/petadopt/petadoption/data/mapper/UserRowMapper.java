/**
 * Maps a SQL result set row to a User entity.
 * Implements RowMapper for integration with JdbcTemplate.
 */
package com.petadopt.petadoption.data.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import com.petadopt.petadoption.data.entity.UserEntity;

/**
 * RowMapper implementation to map user data from ResultSet.
 */
public class UserRowMapper implements RowMapper<UserEntity> {

	@Override
	/**
     * Maps a row of the ResultSet to a UserEntity object.
     *
     * @param rs the ResultSet to map
     * @param rowNum the number of the current row
     * @return a populated UserEntity object
     */
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
