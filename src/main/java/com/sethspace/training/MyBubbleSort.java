package com.sethspace.training;

public class MyBubbleSort {

	
	public static void main(String args[]){
		Integer[] a = new Integer[]{5,1,4,2,8};
		
		int i,j,temp;
		
		for(i=0;i<a.length;i++){
			for(j=0;j<a.length-1;j++){
				if(a[j+1]<a[j]){
					temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}
