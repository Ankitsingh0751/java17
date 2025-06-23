import static org.junit.Assert.*;

import org.junit.Test;

public class All_Annotations {

	@Test
	public void test1() {
		System.out.println("Test method1 called");
	}
	
	@Before
	public void testBefore() {
		System.out.println("Before method");
	}
	
	@After
	public void testAfter() {
		System.out.println("After method");
	}
	
	@BeforeClass
	public static void testBeforeClass() {
		System.out.println("Before Class method");
	}
	
	@AfterClass
	public static void testAfterClass() {
		System.out.println("After Class method");
	}
	
	@Ignore
	@Test
	public void testIgnore() {
		System.out.println("Test Ignored");
	}
	
	@Test
	public void test2() {
		System.out.println("Test2 method");
	}

}
