package com.sethspace.training;

public class MyMergeSort {
	
	
	public static void main(String args[]){
		
		int[] a = new int[]{45,32,25,9,102,64,31,78};
		
		int l,r;
		
		l = 0; r = a.length-1;
		
		a = mergeSort(a,l,r);
		
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		
	}
	
	public static int[] mergeSort(int[] a,int l,int r){
		
		int mid;
		
		if(l==r){
			return a;
		}
		else{
			mid = (l+r)/2;
			
			a = mergeSort(a,l,mid);
			a = mergeSort(a,mid+1,r);
			
			return merge(a,l,mid,r);
		}		
	}
	
	public static int[]  merge(int[]a ,int l, int mid, int r){
		
		int i,j,k;
		int[] b = a.clone();
		
		i = l;
		j=mid+1;
		k =l-1;
		
		while(i<=mid && j<=r){
			if(a[i]<a[j]){
				b[++k] = a[i];
				i++;
			}
			else{
				b[++k] =a[j];
				j++;
			}
		}
		
		if(i==mid+1){
			while(j<=r){
				b[++k] = a[j];
				j++;		
			}
		}
		else if(j==r+1){
			while(i<=mid){
				b[++k] = a[i];
				i++;
			}
		}
		return b;
	}
	
	
}
