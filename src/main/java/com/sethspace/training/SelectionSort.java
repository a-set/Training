package com.sethspace.training;

import java.util.List;

public class SelectionSort {
	
	
	static Integer[] a = new Integer[] {64,25,12,22,11};
	
	public static void main(String args[]){
		int i,j,min,temp;
		
		for(i=0;i<a.length-1;i++){
			min = i;
			j=i+1;
			while(j<a.length){
				if(a[j]<a[min]){
					min =j;
				}
				j++;
			}
			//Only swap if necessary
			if(min!=i){
				temp = a[min];
				a[min] = a[i];
				a[i] = temp;
			}
		}
		
		for(i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
	
}
