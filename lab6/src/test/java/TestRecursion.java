//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;
//
//public class TestRecursion {
//	@Test
//	public void testFibRec() {
//		// Test recursive fibonacci
//		int n = 15;  
//		Lab06.resetCallCount();
//		int result = Lab06.fibonacciRec(n);
//		int recursiveCalls = Lab06.getCallCount();
//		assertEquals(result, 610, "Recursive fibonacci 15 does not return correct result (610).");
//		assertTrue(recursiveCalls > 1500 && recursiveCalls < 2500, "Fibonacci (15) recursive calls is not correct.");
//
//		n = 10;  
//		Lab06.resetCallCount();
//		result = Lab06.fibonacciRec(n);
//		recursiveCalls = Lab06.getCallCount();
//		assertEquals(result, 55, "Recursive fibonacci 10 does not return correct result (55).");
//		assertTrue(recursiveCalls > 150 && recursiveCalls < 200, "Fibonacci (10) recursive calls is not correct.");
//	}
//
//	@Test
//	public void testFibIter() {
//		// Test iterative fibonacci
//		int n = 15;  
//		Lab06.resetCallCount();
//		int result = Lab06.fibonacciIter(n);
//		int iterations = Lab06.getCallCount();
//		assertEquals(result, 610, "Iterative fibonacci 15 does not return correct result (610).");
//		assertTrue(iterations > 12 && iterations < 16, "Fibonacci (10) iterations is not correct.");
//
//		n = 10;  
//		Lab06.resetCallCount();
//		result = Lab06.fibonacciIter(n);
//		iterations = Lab06.getCallCount();
//		assertEquals(result, 55, "Iterative fibonacci 10 does not return correct result (55).");
//		assertTrue(iterations > 7 && iterations < 12, "Fibonacci (10) iterations is not correct.");
//	}
//
//	@Test
//	public void testHanoi1() {
//		// Test Towers of Hanoi #1
//		String solution = Lab06.solveHanoi(1, 3, 2, 1);
//		assertEquals(solution, "Move top ring from peg 1 to peg 3.\n", "Single ring Towers of Hanoi solution doesn't match.");
//	}
//
//	@Test
//	public void testHanoi2() {
//		// Test Towers of Hanoi #2
//		String solution = Lab06.solveHanoi(1, 3, 2, 2);
//		assertEquals(solution, "Move top ring from peg 1 to peg 2.\nMove top ring from peg 1 to peg 3.\nMove top ring from peg 2 to peg 3.\n", "Two ring Towers of Hanoi solution doesn't match.");
//	}
//
//	@Test
//	public void testHanoi3() {
//		// Test Towers of Hanoi #3
//		String solution = Lab06.solveHanoi(1, 3, 2, 3);
//		assertEquals(solution, "Move top ring from peg 1 to peg 3.\nMove top ring from peg 1 to peg 2.\nMove top ring from peg 3 to peg 2.\nMove top ring from peg 1 to peg 3.\nMove top ring from peg 2 to peg 1.\nMove top ring from peg 2 to peg 3.\nMove top ring from peg 1 to peg 3.\n", "Three ring Towers of Hanoi solution doesn't match.");
//	}
//}
