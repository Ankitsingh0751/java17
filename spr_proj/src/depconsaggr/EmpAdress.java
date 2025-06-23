package depconsaggr;
import java.util.*;

public class EmpAdress {
	int id;
	String name;
	
	List addr;

	public EmpAdress(int id, String name, List addr) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
	}
	
	public void show() {
		System.out.println("Id is : "+id+ "\n Name is:"+name);
		Iterator it = addr.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
