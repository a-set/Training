package com.sethspace.training;

public class CountInversions {
	
	private static int[] a = new int[]{34,24,11,7,92,60,54}; 
	
	public static void main(String args[]){
		
		int l = 0;
		int h = a.length - 1;
		
		int countInversion = getCountInversion(l,h);
		
		System.out.println("The number of count inversions in this array is " + countInversion);
		
	}
	
	public static int getCountInversion(int l,int h){
		
		
		if(l==h){
			return 0;
		}
		
		else{
			int mid = (l+h)/2;
			 return getCountInversion(l,mid) + getCountInversion(mid+1,h) + merge(mid,l,h);
		}
	}
	
	public static int merge(int mid, int l,int h){
		
		/**
		 * Traditionals merge sort counters
		 */
		
		int i,j,k;
		
		/**
		 * Inversion count pointer
		 */
		
		int inv_count = 0;
		
		int[] b = a.clone();
		
		i = l;
		j=mid+1;
		k =l-1;
		
		while(i<=mid && j<=h){
			if(a[i]<a[j]){
				b[++k] = a[i];
				i++;
			}
			else if(a[i]==a[j]){
				b[++k] = a[i];
				b[++k] = a[j];
				i++;
				j++;
			}
			else{
				b[++k] =a[j];
				j++;
				inv_count += mid-i+1;
			}
		}
		
		if(i==mid+1){
			while(j<=h){
				b[++k] = a[j];
				j++;		
			}
		}
		else if(j==h+1){
			while(i<=mid){
				b[++k] = a[i];
				i++;
			}
		}
	
		return inv_count;
	}
	
	
	
	
}
