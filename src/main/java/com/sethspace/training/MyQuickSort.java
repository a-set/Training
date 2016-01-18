package com.sethspace.training;

public class MyQuickSort {
	
	public static void main(String args[]){
		int[] a = {23  , 43 , 69 , 3 , 28, 109, 43, 32 };
		quickSort(a,0,a.length-1);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}

	
	
	private static void quickSort(int[] a,int left, int right){
		
		int index  = partition(a,left,right);
		
		if(left<index-1)
			quickSort(a,left,index-1);
		
		if(right>index)
			quickSort(a,index,right);

	}
	
	private static int partition(int[] a , int left, int right){
		
		int pivot = a[(left+right)/2];
		while(left<=right){
			while(a[left]<pivot) left++;
			while(a[right]>pivot) right--;
			
			if(left<=right){
				swap(a[left],a[right]);
				left++;
				right--;
			}
		}
		return left;
	}
	
	private static void swap(int a,int b){
		int temp = a;
		a =b;
		b = temp;
	}

}
