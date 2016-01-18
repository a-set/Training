package com.sethspace.training;

/**
 * You are given two 32-bit numbers, N and M, and two bit positions, i and j.
 * Write a method to set all bits between i and j in N equal to M (e.g., M
 * becomes a substring of N located at i and starting at j)
 * 
 * For example: N = AAAAAAAAAAA
 * 			  : M =   BBBBB		( i = 2 , j = 6)  	
 * 		result:   = AABBBBBAAAA
 * 
 * Math:          = 11110000000 OR
 * 			      = 00000000011
		  mask:   = 11110000011  & 
 * 		  N       = AAAAAAAAAAA
 * 			      = AAAA00000AA
 *                = 0000BBBBB00  OR
 *        result  = AAAABBBBBAA 
 *
 * @author Anirudh
 *
 */

public class MaskingBits {
	
	public static int maskBits(int n, int m, int i, int j){
		int max = ~0; 
		int mask = max<<(j+1) | ((1<<i) - 1);
		return (mask & n) | (m<<i);
	}

}
