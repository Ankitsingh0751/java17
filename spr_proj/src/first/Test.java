package first;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		
		//Resource res = new ClassPathResource("first/context.xml");
		
		//BeanFactory fact = new XmlBeanFactory(res);
		
		
		ApplicationContext con = new ClassPathXmlApplicationContext("first/context.xml");
		
		//Student s = (Student)fact.getBean("stu");
		Student s1 = (Student)con.getBean("stu1");
		s1.setName("Ankit");
		System.out.println(s1.getName());
		
		Student s2 = (Student)con.getBean("stu1");
		System.out.println(s2.getName());
		
		//s.dis();
	}
}