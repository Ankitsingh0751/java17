import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest2 {

	@Test
	public void testFact() {
		Calculator c = new Calculator();
		assertEquals(120,c.fact(5));
	}

}
