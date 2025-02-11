package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubtractionTest {

	@Test
	public void subtractionTest() {
		MathUtils test = new MathUtils();
		int result = test.subtract(4, 8);
		assertEquals(4, result);
		
	}

}
