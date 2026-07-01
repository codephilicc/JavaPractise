package com.practice.spring.springjdbc.assignment;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PlayerRowMapper implements RowMapper<Player>{

	@Override
	public Player mapRow(ResultSet rs, int rowNum) throws SQLException {
		Player pl = new Player();
		pl.setId(rs.getInt(1));
		pl.setFirstName(rs.getString(2));
		pl.setLastName(rs.getString(3));
		return pl;
	}

}
