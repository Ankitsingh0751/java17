package oneToMany;
import java.util.*;

public class Department {
	int id;
	String Dname;
	Set employeeSet;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDname() {
		return Dname;
	}
	public void setDname(String dname) {
		Dname = dname;
	}
	public Set getEmployeeSet() {
		return employeeSet;
	}
	public void setEmployeeSet(Set employeeSet) {
		this.employeeSet = employeeSet;
	}

}
