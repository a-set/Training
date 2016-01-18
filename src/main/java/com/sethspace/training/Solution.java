package com.sethspace.training;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int[][] a = new int[N][N];
        int i =0; int j=0;
        while(i<N && sc.hasNextLine()){
            while(sc.hasNextInt()){
                if(j<N){
                    a[i][j] = sc.nextInt();
                }
                else{
                    return;
                }
                j++;
            }
            i++;
            sc.nextLine();
        }
        
        if(i!=N)
            return;
            
        
        System.out.print(diagonalDifference(a));
        sc.close();
    }
    
    private static long diagonalDifference(int[][] a){
        long diff=0; 
        int i =0; // 0 .... N-1
        //int j = a.length-1-i 
        // (2 5 3 ) - (1 3 9)
        // ( 2-1) + (5 -3) + (9-3)
        // 
        
        while(i<a.length){
            diff += (a[i][i] - a[a.length-1-i][a.length-1-i]); 
            i++;
        }

        return diff<0?diff*(-1):diff;
    }
   
}