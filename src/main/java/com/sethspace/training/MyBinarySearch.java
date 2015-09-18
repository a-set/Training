/**
 * 
 */
package com.sethspace.training;

import java.util.Collections;
import java.util.List;

/**
 * @author Anirudh
 *
 */
public class MyBinarySearch {
	
	/**
	 * This method searches for a number in the given list of numbers and returns true if the number exists
	 * and false if the number does not exist
	 * @param numbers The list of numbers on which the search is performed
	 * @param number The number we are looking for
	 * @return returns -1 if the number is not found and the index in the List if the number is found. The index starts from 0.
	 */
	public static int performSearch(List<Integer> numbers, Integer number){
		
		/*
		 * Sort the list in ascending order
		 */
		Collections.sort(numbers);
		
		/*
		 * Get the middle element
		 */
		
		int mid = number/numbers.size()-1;
		
		/*
		 * While the mid is a legal index perform binary search
		 */
		while(mid>=0 && mid<numbers.size()){
			if(number>numbers.get(mid))
				mid = mid+1;
			else if(number<numbers.get(mid))
				mid = mid -1;
			else
				return mid;
		}
		
		/**
		 * Return a negative number to indicate that the number was not found in the list
		 */
		return -1;
	}
	
}
