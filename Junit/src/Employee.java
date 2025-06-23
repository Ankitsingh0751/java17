

import java.util.*;

class EmployeeNotFound extends RuntimeException {
	public EmployeeNotFound(String message) {
		super(message);
	}
	
	public EmployeeNotFound() {
		super("No employee record found");
	}
}

public class Employee {
	Map<Integer, String> employee = new HashMap<>();
	
	public Employee(){
		employee.put(1, "Prathamesh");
		employee.put(2, "Yash");
		employee.put(3, "Gauresh");
	}
	
	public String  getEmployee(int id) {
		String eName = employee.get(id);
		if(eName == null) {
			throw new EmployeeNotFound("Not employee with given id.");
		}
		return this.employee.get(id);
	}
}
