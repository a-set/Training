package com.sethspace.training;

public class AnagramChecker {

	public static void main(String args[]){
		String a = "Mary";
		String b = "Army";
		a =a.toLowerCase();
		b = b.toLowerCase();
		System.out.println(isAnagram(a,b));
	}
	
	static boolean isAnagram(String a,String b){
		if(a.length()!=b.length())
			return false;
		else{
			long residual = 0;
			for (int i=0;i<a.length();i++){
				int one = (int)a.charAt(i);
				int two =(int)b.charAt(i);
				residual +=(one - two);
			}
			return (residual == 0) ?true:false;
			
		}
	}
	
}
