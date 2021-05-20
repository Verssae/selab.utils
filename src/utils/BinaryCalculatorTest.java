package utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BinaryCalculatorTest {
	
	BinaryCalculator calc = new BinaryCalculator(); 

	@Test
	void test() {
		System.out.println("Test method call");
		assertEquals(3/2, calc.div(3, 2));
	}
	
	@Test
	@DisplayName("Multiple Unit Test")
	void assertTest() {
		System.out.println("Assert Test method call");
		assertAll("calc div", 
			() -> assertEquals(3/2, calc.div(3, 2)),
			() -> assertSame(3/2, calc.div(3, 2)),
			() -> assertTrue(3/2 == calc.div(3, 2))
		);
	}
	
	@Test 
	void failureTest() {
		System.out.println("Failure Test method call");
		assertTrue(false);
	}
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("BeforeAll method call\n");
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.println("BeforeEach method call");
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("AfterEach method call");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("\nAfterAll method call");
	}
	

}
