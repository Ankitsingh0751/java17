package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DAO.EmployeeDAO;
import com.model.Employee;

@Service("eservice")
public class serviceImpl implements Employeeservice{
	@Autowired
	EmployeeDAO edao;

	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		edao.addEmployee(emp);
		
	}

	@Override
	public List<Employee> listEmployee() {
		// TODO Auto-generated method stub
		return edao.listEmployee();
		
	}
	
	
	
	

}
