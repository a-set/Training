package com.sethspace.training;

import java.util.HashMap;

public class FindIfStringHasUniqueElements {
	
	public static boolean isUnique(String str){
		HashMap<Character,Character> uniqueTestMap = new HashMap<Character,Character>();
		
		for(int i=0;i<str.length();i++){
			if(uniqueTestMap.containsKey(str.charAt(i)))
				return false;
			else
				uniqueTestMap.put(str.charAt(i),str.charAt(i));
					
		}
	return true;
	}
	
	public static void main(String args[]){
		System.out.println(isUnique("Anirudh Set"));
	}
	
	
}
