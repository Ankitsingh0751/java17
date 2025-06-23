package autowireex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
	String name;
	@Autowired
	B b;
	

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
	
//	public A(B b) {
//		super();
//		this.b = b;
//	}
//	
//	
//	
//	public A(B b,String name) {
//	
//	this.b = b;
//	name = name;
//	System.out.println("Two parameters");
//}



	public void printing()
	{
		System.out.println("Hello A");
	}
	
	public void disp()
	{
		printing();
		b.printing();
	}

	
	
	

}
