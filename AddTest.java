package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	public void testAdd() {
		MathUtils test = new MathUtils();
		int result = test.add(7,3);
		assertEquals(10, result);
	}
}
