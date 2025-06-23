import static org.junit.Assert.*;

import org.junit.Test;

public class ArithmeticCalTest {

	@Test(expected = ArithmeticException.class)
	public void testCalc() {
		ArithmeticCal a = new ArithmeticCal();
		a.calc(2,2);

}
}