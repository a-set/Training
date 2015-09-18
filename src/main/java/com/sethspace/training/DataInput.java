package com.sethspace.training;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataInput {
	
	private final Scanner scanner;
	private final PrintStream out;
	
	public DataInput(InputStream in,PrintStream out){
		scanner = new Scanner(in);
		this.out = out;
	}
	
	/**
	 * This method is used to get a Data List from the user 
	 * @param purpose
	 * @return
	 */
	public  List<Integer> getDataListFromUser(String message) {

		/*
		 * This flag determines if the user is done entering the array elements
		 */
		boolean doneEntering = false;

		/*
		 * Create an empty array list to store the elements
		 */
		List<Integer> inputData = new ArrayList<Integer>();

		System.out.println(message);
		
		System.out.println("Enter the first eleement");
		
		inputData.add(ask("Enter an Integer"));

		while (doneEntering == false) {
			System.out.println("Do you wanna enter another item ? Y/N ?");
			
			String answer = scanner.next();
			
			if (answer.toLowerCase().equals("n"))
				doneEntering = true;
			else {
				inputData.add(ask("Enter an Integer"));
			}

		}
		return inputData;
	}
	
	public  int ask(String message){
		out.println(message);
		return scanner.nextInt();
	}

}
