package com.sethspace.training;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyInsertionSortTest {
	
	private DataInput dataInput;
	
	public MyInsertionSortTest() {
		dataInput = new DataInput(System.in, System.out);
	}
	
	@Test
	public void testIntegers(){
		// Get data from the user
		List<Integer> testInput = dataInput.getDataListFromUser("Test Insertion sort with Integers. Enter the Unsorted Array");
	
		//Get the expected output from the user
		List<Integer> testExpected = dataInput.getDataListFromUser("Enter the unsorted list of Integers");
		
		Integer[] expectedArray = new Integer[testExpected.size()];
		testExpected.toArray(expectedArray);
		
		//Compute the actual output
		InsertionSort<Integer> testSort = new InsertionSort<Integer>(SortingOrder.ASCENDING);
		List<Integer> testOutput = (List<Integer>) testSort.performSort(testInput);
		Integer[] actualArray = new Integer[testOutput.size()];
		testOutput.toArray(actualArray);
		
		
		//Perform assertion
		assertArrayEquals("Test Failed",expectedArray,actualArray);
		
		
	}
	
	
}
