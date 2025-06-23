package First;

import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.SessionFactory;



public class Main {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session sess = sf.openSession();
		Transaction tx = sess.beginTransaction();
		
		
		Product p = new Product();
		p.setPname("Television");
		p.setPrice(25000);
		
		
		sess.save(p);
		tx.commit();
		
	}
	
}
