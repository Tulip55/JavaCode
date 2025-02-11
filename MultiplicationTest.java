package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiplicationTest {

	@Test
	public void multiplicationTest() {
		MathUtils test = new MathUtils();
		int result = test.multiply(10, 7);
		assertEquals(70, result);
	}

}
