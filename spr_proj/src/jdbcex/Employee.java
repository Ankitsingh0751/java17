package jdbcex;

public class Employee {
	int eid;
	String name;
	int esal;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	public Employee(int eid, String name, int esal) {
		super();
		this.eid = eid;
		this.name = name;
		this.esal = esal;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
