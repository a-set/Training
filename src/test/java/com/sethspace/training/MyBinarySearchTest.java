/**
 * 
 */
package com.sethspace.training;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

/**
 * @author Anirudh
 *
 */
public class MyBinarySearchTest {

	private DataInput dataInput;

	public MyBinarySearchTest() {
		dataInput = new DataInput(System.in, System.out);
	}

	@Test
	public void testSuccess() {
		// Get data from the user
		List<Integer> testData = dataInput.getDataListFromUser("Test for Success");

		// Get the test parameter from the user
		Integer testParam = dataInput.ask("Enter a number which is in the array");

		// Get the index of the test parameter in the given array
		Integer testParamIndex = dataInput.ask("Enter the index of this number, considering the indices start from 0");

		// Check if it was found or not
		assertSame("Test Failed", testParamIndex, MyBinarySearch.performSearch(testData, testParam));

		// Print that the test succeeded
		System.out.println("Test Succeeded");

	}

	@Test
	public void testFailure() {
		// Get data from the user
		List<Integer> testData = dataInput.getDataListFromUser("Test for failure");

		// Get the test parameter from the user
		Integer testParam = dataInput.ask("Enter a number which is not in the array");

		// Look for an element not in the Data entered , say -12
		assertSame("Test Failed", -1, MyBinarySearch.performSearch(testData, testParam));

		// Print that the test succeeded
		System.out.println("Test Succeeded");
	}

}
