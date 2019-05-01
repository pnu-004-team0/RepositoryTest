import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator lib = new Calculator();
		double result = lib.add(10, 50);
		assertEquals(60, result, 0);
		
	}
}
