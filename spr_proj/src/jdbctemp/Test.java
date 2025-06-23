package jdbctemp;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("jdbctemp/jdbcconf.xml");
		
		StudentDaoImpl stud=(StudentDaoImpl)con.getBean("edao");
		
	/*	stud.create(101, "Amith", "CS");
		stud.create(102, "Aaron", "IT");
		stud.create(103, "Luci", "MBA"); */
	//	stud.update(102,"CA");
		stud.delete(100);
		
		List<Student> ls=stud.listStudent();
		
		for(Student info:ls)
		{
			System.out.println("Student Id: "+info.getId());
			System.out.println("Student Name: "+info.getName());
			System.out.println("Student Course: "+info.getCourse());
		}
	}
}