package first;

public class Student {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void dis() {
		System.out.println("Hello : "+name);
	}
	
	public void init() {
		System.out.println("Instantiated");
	}
	
	public void destroy() {
		System.out.println("Destroyed");
	}
}


/*

Init method
destroy method
*/