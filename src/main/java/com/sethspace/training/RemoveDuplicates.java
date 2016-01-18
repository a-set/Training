package com.sethspace.training;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		RemoveDuplicates rm = new RemoveDuplicates();
		String s = "abccdec";
		rm.removeAndPrintDuplicates(s.toCharArray());

	}
	
	public void removeAndPrintDuplicates(char[] str){
		
		int left = 0;
		int right = str.length;
		
		for(int i=left;i<right;i++){
			for(int j=i+1;j<right;j++){
				if(str[j] == str[i]){
					//Delete the duplicate at J
					int k = j;
					//If the element to be deleted is closer to right end
					if(j>=str.length/2){
						while(k<str.length-1){
							str[k] = str[k+1];
							k++;
						}
						right--;
					}
					//If the element is closer to left end
					else{
						while(k>0){
							str[k] = str[k-1];
							k--;
						}
						left++;
					}
					
				}
					
			}
		}
		
		//Now print the new character array
		for (int i=left;i<right;i++){
			System.out.print(str[i]);
		}
		System.out.println();
		
		
	}

}
