package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Stack;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	String[] words = {"1", "4", "2", "6", "5", "3"};
	int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		assertEquals(1, _00_LinearSearch.linearSearch(words, "4"));
		assertEquals(-1, _00_LinearSearch.linearSearch(words, "7"));
		assertEquals(4, _00_LinearSearch.linearSearch(words, "5"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method. remember that the array must be sorted
		assertEquals(8, _01_BinarySearch.binarySearch(array, 0, array.length - 1, 9));
		assertEquals(-1, _01_BinarySearch.binarySearch(array, 0, 1, 4));
		assertEquals(4, _01_BinarySearch.binarySearch(array, 3, 8, 5));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		assertEquals(-1, _02_InterpolationSearch.interpolationSearch(array, 12));
		assertEquals(4, _02_InterpolationSearch.interpolationSearch(array, 5));
		assertEquals(8, _02_InterpolationSearch.interpolationSearch(array, 9));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		assertEquals(-1, _03_ExponentialSearch.exponentialSearch(array, 12));
		assertEquals(4, _03_ExponentialSearch.exponentialSearch(array, 5));
		assertEquals(8, _03_ExponentialSearch.exponentialSearch(array, 9));
	}
}
