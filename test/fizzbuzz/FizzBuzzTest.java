package fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;


public class FizzBuzzTest {

	@Test
	public void testFizzBuzzProcessing_01() {
		assertEquals("FizzBuzz", FizzBuzz.FizzBuzzProcessing(15));
	}

	@Test
	public void testFizzBuzzProcessing_02() {
		assertEquals("FizzBuzz", FizzBuzz.FizzBuzzProcessing(30));
	}

	@Test
	public void testFizzProcessing_01() {
		assertEquals("Fizz", FizzBuzz.FizzBuzzProcessing(3));
	}

	@Test
	public void testFizzProcessing_02() {
		assertEquals("Fizz", FizzBuzz.FizzBuzzProcessing(6));
	}

	@Test
	public void testBuzzProcessing_01() {
		assertEquals("Buzz", FizzBuzz.FizzBuzzProcessing(5));
	}

	@Test
	public void testBuzzProcessing_02() {
		assertEquals("Buzz", FizzBuzz.FizzBuzzProcessing(10));
	}

	@Test
	public void testNumberProcessing_01() {
		assertEquals("4", FizzBuzz.FizzBuzzProcessing(4));
	}

	@Test
	public void testNumberProcessing_02() {
		assertEquals("8", FizzBuzz.FizzBuzzProcessing(8));
	}

}
