package com.sethspace.training;

public class MatrixOperations {
	
	
	public static void main(String args[]){
		
		int[][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		printArray(a);
		System.out.println("Printing rotated array");
		printArray(rotate(a,a.length));
		
	}
	
	public static void printArray(int[][] a){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
	  }	
	}
	
	public static int[][] rotate(int[][] a,int n){
		if(a==null||a.length==0)
			return null;
		else{
			int temp;
			for(int alpha=0;alpha<n/2;alpha++){
				for(int i=alpha;i<n-1-alpha;i++){
					temp = a[n-1-alpha][i];
					a[n-1-alpha][i] = a[i][alpha];
					a[i][alpha] = a[alpha][n-1-i];
					a[alpha][n-1-i] = a[n-1-i][n-1-alpha];
					a[n-1-i][n-1-alpha] = temp;
			}
		}
			return a;	
	}
	
}
}