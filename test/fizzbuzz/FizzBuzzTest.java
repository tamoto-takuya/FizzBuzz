package fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;


public class FizzBuzzTest {

	@Test
	public void test引数15の場合FizzBuzz() {
		assertEquals("FizzBuzz", FizzBuzz.FizzBuzzProcessing(15));
	}

	@Test
	public void test引数30の場合FizzBuzz() {
		assertEquals("FizzBuzz", FizzBuzz.FizzBuzzProcessing(30));
	}

	@Test
	public void test引数3の場合Fizz() {
		assertEquals("Fizz", FizzBuzz.FizzBuzzProcessing(3));
	}

	@Test
	public void test引数6の場合Fizz() {
		assertEquals("Fizz", FizzBuzz.FizzBuzzProcessing(6));
	}

	@Test
	public void test引数5の場合Buzz() {
		assertEquals("Buzz", FizzBuzz.FizzBuzzProcessing(5));
	}

	@Test
	public void test引数10の場合Buzz() {
		assertEquals("Buzz", FizzBuzz.FizzBuzzProcessing(10));
	}

	@Test
	public void test引数4の場合4() {
		assertEquals("4", FizzBuzz.FizzBuzzProcessing(4));
	}

	@Test
	public void test引数8の場合8() {
		assertEquals("8", FizzBuzz.FizzBuzzProcessing(8));
	}

}
