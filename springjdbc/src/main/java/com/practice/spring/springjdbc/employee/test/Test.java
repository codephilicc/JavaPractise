package com.practice.spring.springjdbc.employee.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.practice.spring.springjdbc.employee.dao.EmployeeDao;
import com.practice.spring.springjdbc.employee.dto.Employee;

import java.util.List;

import org.springframework.context.ApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/practice/spring/springjdbc/employee/test/config.xml");

		EmployeeDao dao = (EmployeeDao) context.getBean("employeeDao");

		/*Employee employee = new Employee();
		employee.setId(3);
		employee.setFirstname("Lockie");
		employee.setLastname("Fergusion");*/
		//int result = dao.create(employee);
		//int result =dao.update(employee);
		//int result=dao.delete(2);
		
		//Employee employee = dao.read(1);
		
		List<Employee> result = dao.read();
		System.out.println("Employee: " + result);

	}

}
