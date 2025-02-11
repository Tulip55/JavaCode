package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivisionTest {

	@Test
	public void divisionTest() {
		MathUtils test = new MathUtils();
		double result = test.divide(60, 6);
		assertEquals(10, result);
	}

}
