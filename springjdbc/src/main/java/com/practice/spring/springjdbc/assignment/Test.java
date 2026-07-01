package com.practice.spring.springjdbc.assignment;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/practice/spring/springjdbc/assignment/conf.xml");
			PlayerDao dao = (PlayerDao) ctx.getBean("playerDao");
			Player player = new Player();
			player.setId(1);
			player.setFirstName("Rohit");
			player.setLastName("Sharma");
			//int result = dao.create(player);
			//int result = dao.update(player);
			//int result = dao.delete(1);
			//Player pla = dao.read(1);
			List<Player> result = dao.read(); 
			System.out.println("player " +result);
			
	}

}
