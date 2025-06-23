package criteriaprog;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import java.util.*;

public class Main {
	
		static SessionFactory sf;
		public static void main(String[] args) {
			Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
			sf = cfg.buildSessionFactory();
			
			Main m = new Main();
			
			//m.addEmployee("Annnkiiit", "SSiingh", 1234567);
			//m.deleteEmployee(21);
			m.updateEmployee(24,"ATUL","SIIIINNNGGGHHH",45000);
			m.listEmployee();
	}
		
		public void listEmployee()
	    {
	        Session s=sf.openSession();
	        Transaction tx=s.beginTransaction();

	        Criteria cr=s.createCriteria(Employee.class);
	        //cr.setProjection(Projections.sum("sal"));
	       // List ls = s.createQuery("from Employee").list();
	        //List ls=cr.list();
	        
	       // System.out.println(ls.get(0));
	        cr.add(Restrictions.gt("sal",50000));
	        List ls=cr.list(); //removed from above to here for this particular method.
	        

	        for(Iterator it=ls.iterator();it.hasNext();)
	        {
	            Employee e=(Employee)it.next();
	            System.out.println(e.getId());
	            System.out.println(e.getFname());
	            System.out.println(e.getLname());
	            System.out.println(e.getSal());
	        }

	    }
		
		public Integer addEmployee(String fname,String lname,int sal)
		{
			Session s = sf.openSession();
			Transaction tx = s.beginTransaction();
			Employee e = new Employee(fname, lname,sal);
			Integer i = (Integer)s.save(e);
			tx.commit();
			s.close();
			
			return i;
		}
	
		public void deleteEmployee(Integer eid)
		{
			Session s = sf.openSession();
			Transaction tx = s.beginTransaction();
			Employee e = (Employee)s.get(Employee.class, eid);
			s.delete(e);
			tx.commit();
		}
		
		public void updateEmployee(Integer eid,String fname,String lname,int salary) {
	        Session s = sf.openSession();
	        Transaction tx = s.beginTransaction();

	        Employee e =(Employee) s.get(Employee.class,eid);

	        e.setFname(fname);
	        e.setLname(lname);
	        e.setSal(salary);

	        Integer i = (Integer) s.save(e);

	        tx.commit();
	        s.close();
	    }		
}
