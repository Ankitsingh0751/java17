package first;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class Test {
	public static void main(String[] args)
	{
		
		Resource res= new ClassPathResource("first/context.xml");
		
		
		
		BeanFactory fact = new XmlBeanFactory(res);
		
		Student s = (Student)fact.getBean("stu");
		
		s.display();
	}	
}
