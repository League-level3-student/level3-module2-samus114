package _99_extra.recursion_practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RecursionMath {
	
	public static int recursiveMultiplication(int number, int times) {
		//2. if times is 1 
		if (times == 1) {
			//3. return number 
		return number;
		} else {
		//4. else return number + recursionMultiplication(number, times-1)
		return number + recursiveMultiplication(number, times-1);
		}
	}
	
	//6. Try this one on your own! 
	//Hint: if numberToDevideBy is bigger than number, you can't divide anymore
	public static int recursiveDivision(int number, int numberToDevideBy) {
		if (numberToDevideBy > number) {
			return 0;
		} else if (number > numberToDevideBy) {
			return number / numberToDevideBy;
		} else {
			return 0;
		}
	}
	
	//8. Try this one on your own!
	public static int recursivePower(int number, int power) {
		return 0;
		
	}
	
	
	
	@Test
	public void testMultiplication() {
		assertEquals(12, recursiveMultiplication(3, 4));
		assertEquals(10, recursiveMultiplication(2, 5) );
		assertEquals(20, recursiveMultiplication(4, 5));
		assertEquals(0, recursiveMultiplication(0, 4));
		//1  Add more JUnit tests like the one above to test your method
		
	}
	
	
	@Test
	public void testDivision() {
		//5  Add JUnit tests to test your method
		assertEquals(0, recursiveDivision(0, 4));
		assertEquals(20, recursiveDivision(100, 5));
		assertEquals(4, recursiveDivision(4, 16));
		assertEquals(5, recursiveDivision(100, 20));
	}
	
	
	//@Test 
	public void testPower() {
		//7  Add JUnit tests to test your method
	
	}	
}