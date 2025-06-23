package autowireex;

import org.springframework.stereotype.Component;

@Component
public class B {
		
	public B() {
		System.out.println("B is created.");
	}
	
	public void printing() {
		System.out.println("Hello B");
	}
}
