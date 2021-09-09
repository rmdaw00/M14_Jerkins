package test.com.rmdaw;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import src.com.rmdaw.calculator.Calculator;

public class calculatorTest {
	@Test
	public void test() {
		Calculator calc = Calculator.getInstance();

		try {
			assertEquals(4,calc.compute("2x2"));
			assertEquals(6,calc.compute("6+2"));
			assertEquals(3,calc.compute("6/2"));
			assertEquals(4,calc.compute("06-2"));
			assertEquals(-14,calc.compute("6-20"));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			fail(null);
		}
	}

}
