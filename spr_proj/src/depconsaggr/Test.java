package depconsaggr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args)
	{
		ApplicationContext con = new ClassPathXmlApplicationContext("depconsaggr/agrrcon.xml");
		
		EmpAdress e = (EmpAdress)con.getBean("e1");
		e.show();
		
	}
}
