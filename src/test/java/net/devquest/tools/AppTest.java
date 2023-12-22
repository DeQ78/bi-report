package net.devquest.tools;

//JUnit 4
//import static org.junit.Assert.assertTrue;
//import org.junit.Test;
//
//public class AppTest {
//	@Test
//	public void SamMethodTest() {
//		
//		assertTrue(true);
//	}
//}

import static org.junit.Assume.assumeTrue;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {

	@Test
	void SamMethodTest() {
		assumeTrue(true);
	}

}
