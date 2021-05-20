package utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BinaryCalculatorTest {
	
	BinaryCalculator calc = new BinaryCalculator(); 

	@Test
	void test() {
		assertEquals(3/2, calc.div(3, 2));
	}
	
	@Test
	@DisplayName("Multiple Unit Test")
	void assertTest() {
		assertAll("calc div", 
			() -> assertEquals(3/2, calc.div(3, 2)),
			() -> assertSame(3/2, calc.div(3, 2)),
			() -> assertTrue(3/2 == calc.div(3, 2))
		);
	}
	
	@Test 
	void failureTest() {
		assertTrue(false);
	}

}
