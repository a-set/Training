package com.sethspace.training;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MyTestRunner {
	
	
	/*
	 * Main method that starts the testing
	 */
	
	public static void main(String args[]){
		runTests();
	}
	
	
	/*
	 * This method is used to run the test cases
	 */
	
	public static void runTests(){
		
	 Result result = JUnitCore.runClasses(MyBinarySearchTest.class);
	 for(Failure failure: result.getFailures())
		System.out.println(failure.getMessage()); 
	}	
}
