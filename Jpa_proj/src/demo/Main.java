package demo;
import javax.persistence.*;
import javax.persistence.Persistence;
public class Main {
	public static void main(String[] args)
	{
		EntityManagerFactory ef=Persistence.createEntityManagerFactory("Jpa_proj");
		EntityManager em=ef.createEntityManager();
		
		em.getTransaction().begin();
		ProductInfo p = new ProductInfo();
		p.setName("Tablet");
		p.setPrice(35000);
		
		em.persist(p);
		em.getTransaction().commit();
		
	}
}