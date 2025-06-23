package oneToMany;

import org.hibernate.*;

import org.hibernate.cfg.*;
import org.hibernate.SessionFactory;
import java.util.*;



public class Main {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		
		
		Department dept = new Department();
		dept.setDname("IT");
		Set<Employee> set = new LinkedHashSet<>();
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		emp1.setFname("Ankit");
		emp1.setDepartment(dept);
		emp1.setFname("Singh");
		emp2.setFname("Atul");
		emp2.setDepartment(dept);
		emp2.setLname("Singh");
		
		
		set.add(emp1);
		set.add(emp2);
		dept.setEmployeeSet(set);		
		sess.save(dept);
		sess.save(emp1);
		sess.save(emp2);
		tx.commit();
		
		
	}
	
}