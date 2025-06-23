package autowireex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args)
	{
		ApplicationContext con = new ClassPathXmlApplicationContext("autowireex/autowire.xml");
		
		A a1=(A)con.getBean("a");
		a1.disp();
	}
}
