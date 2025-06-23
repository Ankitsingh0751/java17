import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExpectedExceptionTest {

	@Test
	void testExpectedException() {
		NumberFormatException nf = assertThrows(NumberFormatexception.class, ()->{
			
			Integer.parseInt("One");
		},"NumberFormat Exception is expected");
		assertEquals("For Input string: \"One\"",nf.getMessage());
	}
	
		@Test
		void testWithParentType()
		{
			assertThrows(IllegalArgumentException.class, () ->{
				Integer.parseInt("One");
			});
		}
	

}
