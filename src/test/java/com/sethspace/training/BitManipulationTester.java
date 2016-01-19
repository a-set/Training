package com.sethspace.training;

import org.junit.Test;

public class BitManipulationTester {
	
	@Test
	public void testMaskingBits(){
		
		//Get N as a string
		int n = Integer.parseInt("11101101000101",2);
		
		//Get M
		int m = Integer.parseInt("11011",2);
		
		//Get I
		int i = 0;
		
		//Get J
		int j = 5;
		
		//Get the supposed result
		int result = Integer.parseInt("11101101011011",2);
		
		//Make a call to the texting function
		org.junit.Assert.assertEquals("Failure",result,MaskingBits.maskBits(n, m, i, j));
		
	}
	
	@Test
	public void conversionToBinary(){
		//known result
		String expected = "11.01";
		Double input = 3.25;
		
		org.junit.Assert.assertEquals("Failure",expected,ConvertToBinary.convert(input));	
	}
	
	
}
