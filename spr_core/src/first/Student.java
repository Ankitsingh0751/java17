package first;

public class Student {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("hello: "+name);
	}
	
	
	
}


















/*
IOC Containers

BeanFactory   XMLBeanFactory (Implementation classes) --> annotations support is not there.
ApplicationContext  (ClassPathXmlApplicationContext)  --> suppports annotations

BeanFactory instantiated with get Bean 
application instaitate when the container starts working


*/