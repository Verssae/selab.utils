package utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TextGeneratorTest {
	
	TextGenerator textGenerator = new TextGenerator();

	@Test
	void makeText() {
		
		assertAll("makeText test",
//			() -> assertEquals("", textGenerator.makeText(null, 2)),
			() -> assertEquals("", textGenerator.makeText("a", 0)),
			() -> assertEquals("a", textGenerator.makeText("a", 1)),
			() -> assertEquals("aa", textGenerator.makeText("a", 2)),
			() -> assertEquals("", textGenerator.makeText("", 2))			
		);
		
	}
	
	@Test
	void reverseText() {
		assertAll(
//			() -> assertEquals("", textGenerator.reverseText(null)),
			() -> assertEquals("a", textGenerator.reverseText("a")),
			() -> assertEquals("cba", textGenerator.reverseText("abc")),
			() -> assertEquals("", textGenerator.reverseText(""))
		);
		
	}
	
	@Test 
	void halfText() {
		assertAll(
//			() -> assertEquals("", textGenerator.halfText(null)),
			() -> assertEquals("", textGenerator.halfText("")),
			() -> assertEquals("", textGenerator.halfText("a")),
			() -> assertEquals("a", textGenerator.halfText("ab")),
			() -> assertEquals("a", textGenerator.halfText("abc"))
		);	
	}
	
	@Test 
	void halfText2() {
		assertAll(
//			() -> assertEquals("", textGenerator.halfText2(null)),
			() -> assertEquals("", textGenerator.halfText2("")),
			() -> assertEquals("", textGenerator.halfText2("a")),
			() -> assertEquals("a", textGenerator.halfText2("ab")),
			() -> assertEquals("ab", textGenerator.halfText2("abc"))
		);	
	}
	
	@Test
	void halfTexts() {
		assertEquals(textGenerator.halfText("abc"), textGenerator.halfText2("abc"));
	}
	

}
