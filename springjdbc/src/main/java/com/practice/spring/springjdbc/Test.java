package com.practice.spring.springjdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.context.ApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/practice/spring/springjdbc/config.xml");

		JdbcTemplate jdbctemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
		String sql = "insert into employee values(?,?,?)";

		int result = jdbctemplate.update(sql, new Integer(1), "Rahul", "kumar");
		System.out.println("number of record inserted are: " + result);

	}

}
