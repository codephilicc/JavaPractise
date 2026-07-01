package com.practice.spring.springjdbc.assignment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("playerDao")
public class PlayerDaoImpl implements PlayerDao{

	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(Player player) {
		String sql="Insert into player values(?,?,?)";
		int result = jdbcTemplate.update(sql, player.getId(),player.getFirstName(),player.getLastName());
		
		return result;
	}

	@Override
	public int update(Player player) {
		String sql = "update player set firstName=?,lastName=? where id=? ";
		int result = jdbcTemplate.update(sql, player.getFirstName(),player.getLastName(),player.getId());
		return result;
	}

	@Override
	public int delete(int id) {
		String sql ="delete from player where id=?";
		int result = jdbcTemplate.update(sql,id);
		return result;
	}

	@Override
	public Player read(int id) {
		String sql= "select * from player where id=?";
		PlayerRowMapper rowmapper = new PlayerRowMapper();
		Player player = jdbcTemplate.queryForObject(sql, rowmapper,id);
		return player;
	}

	@Override
	public List<Player> read() {
		String sql="select * from player";
		PlayerRowMapper rowmapper = new PlayerRowMapper();
		List<Player> player = jdbcTemplate.query(sql, rowmapper);
		return player;
	}

}
