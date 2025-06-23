package com.DAO;

import java.util.List;

import com.model.Employee;

public interface EmployeeDAO {
	void addEmployee(Employee emp);
	List<Employee> listEmployee();
	
	
}
