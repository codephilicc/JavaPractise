package com.practice.spring.springjdbc.employee.dao;

import java.util.List;

import com.practice.spring.springjdbc.employee.dto.Employee;

public interface EmployeeDao {

	int create(Employee employee);
	
	int update(Employee emplyoee);
	
	int delete(int id);
	
	Employee read(int id);

	List<Employee> read();
}
