package com.sethspace.training;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramCheckerTest {

	private DataInput dataInput;
	public AnagramCheckerTest(){
		dataInput = new DataInput(System.in,System.out);
	}
	
	@Test
	public void test() {
		
		String one = dataInput.getStringFromUser("Enter first String for anagram checker");
		String two = dataInput.getStringFromUser("Enter second String for anagram checker");
		
		
	}

}
