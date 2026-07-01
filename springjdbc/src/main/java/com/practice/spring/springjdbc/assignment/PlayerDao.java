package com.practice.spring.springjdbc.assignment;

import java.util.List;

public interface PlayerDao {
	
	int create(Player player);
	
	int update(Player player);
	
	int delete(int id);
	
	Player read(int id);
	
	List<Player> read();

}
