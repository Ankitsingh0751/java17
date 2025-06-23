package com.Main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Employee;
import com.service.Employeeservice;

public class main {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("resource.xml");
		Employeeservice eservce = (Employeeservice)con.getBean("eservice"); 
		
		Employee e = new Employee();
		e.setName("Ankit");
		e.setSal(70000);
		eserve.addEmployee(e);
		List<Employee> lm = eserve.listEmployee(e);
		
		for(Employee em: lm ) {
			System.out.println(em.getName());
			System.out.println(em.getEno());
			System.out.println(em.getSal());
		}
		
	}
}
