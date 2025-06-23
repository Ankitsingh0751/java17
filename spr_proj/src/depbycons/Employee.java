package depbycons;

public class Employee {
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void disp()
	{
		System.out.println("Employee id :" +id);
		System.out.println("Employee Name :" +name);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
/*	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	*/
}



