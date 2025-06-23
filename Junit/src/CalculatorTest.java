import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testFact() {
		Calculator c = new Calculator();
		assertEquals(120,c.fact(5));
	}

}
