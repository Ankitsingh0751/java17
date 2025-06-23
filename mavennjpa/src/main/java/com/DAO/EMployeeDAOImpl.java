package com.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.model.Employee;



@Repository
public class EMployeeDAOImpl implements EmployeeDAO {
	
	private EntityManager em;
	
	@Override
	@Transactional
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
		em.persist(emp);
		
	}

	@Override
	public List<Employee> listEmployee() {
		// TODO Auto-generated method stub
		TypedQuery <Employee>  emplist = em.createQuery("select e from Employee e",Employee.class);
		List<Employee> ls = emplist.getResultList();
		return ls;
	}
	
	
	
}
