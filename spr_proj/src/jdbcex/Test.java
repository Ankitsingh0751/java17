package jdbcex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("jdbcex/daocontent.xml");
		
		EmployeeDao dao = (EmployeeDao)con.getBean("edao");
		
		Employee e = new Employee();
		
		e.setEid(1);
		e.setName("Ankit Singh");
		e.setEsal(650000);
		
		dao.insertEmp(e);

	}

}