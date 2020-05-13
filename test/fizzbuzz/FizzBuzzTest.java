package fizzbuzz;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class FizzBuzzTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown");
	}

	@Test
	public void testFizzBuzzProcessing_01() {
		System.out.println("FizzBuzzProcessing_01");
		assertEquals("FizzBuzz", FizzBuzz.FizzBuzzProcessing(15));
	}

	@Test
	public void testFizzBuzzProcessing_02() {
		System.out.println("FizzBuzzProcessing_02");
		assertEquals("Fizz", FizzBuzz.FizzBuzzProcessing(3));
	}

	@Test
	public void testFizzBuzzProcessing_03() {
		System.out.println("FizzBuzzProcessing_03");
		assertEquals("Buzz", FizzBuzz.FizzBuzzProcessing(5));
	}

	@Test
	public void testFizzBuzzProcessing_04() {
		System.out.println("FizzBuzzProcessing_04");
		assertEquals("4", FizzBuzz.FizzBuzzProcessing(4));
	}

	@Test
	public void testFizzBuzzProcessing_05() {
		System.out.println("FizzBuzzProcessing_05");
		assertEquals("FizzBuzz", FizzBuzz.FizzBuzzProcessing(30));
	}

	@Test
	public void testFizzBuzzProcessing_06() {
		System.out.println("FizzBuzzProcessing_06");
		assertEquals("Fizz", FizzBuzz.FizzBuzzProcessing(6));
	}

	@Test
	public void testFizzBuzzProcessing_07() {
		System.out.println("FizzBuzzProcessing_07");
		assertEquals("Buzz", FizzBuzz.FizzBuzzProcessing(10));
	}

	@Test
	public void testFizzBuzzProcessing_08() {
		System.out.println("FizzBuzzProcessing_08");
		assertEquals("8", FizzBuzz.FizzBuzzProcessing(8));
	}

}
