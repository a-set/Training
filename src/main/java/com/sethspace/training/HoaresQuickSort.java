package com.sethspace.training;

public class HoaresQuickSort {
	
	public static void main(String args[]){
		int[] a = {23,19,62,78,109,3,8,14,1,9};
		
		sortIt(a,0,a.length-1);
	
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	
	}
	
	
	public static void sortIt(int[] a, int l, int h){
		int p = partition(a,l,h);
		sortIt(a,l,p);
		sortIt(a,p+1,h);
	}
	
	public static int partition(int[] a,int l, int h){
		int pivot = a[0];
		int i= l-1;
		int j = h+1;
	
	while(true){
		do{
			j = j-1;
			System.out.print("Inside j" + j);
		
		}while(a[j]>pivot && j>=l);
		
		do{
			i = i+1;
			System.out.print("Inside i" + i);
		}while(a[i]<pivot && i<=h);
		
		if(i<j){
			int temp = a[i];
			a[i] = a [j];
			a[j] = a[i];
		}
		else 
			return j;
	}
	
	}
}
