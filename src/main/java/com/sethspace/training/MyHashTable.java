package com.sethspace.training;

public class MyHashTable {
	
	int[] associatedArray;
	
	public MyHashTable(int[] givenArray){
		//create space
		associatedArray = new int[givenArray.length];
		//Start by computing hash value and add by computing index
		for(int i =0 ; i<givenArray.length;i++){
			//compute hash value
			int hashvalue = hash(givenArray[i]);
			if((hashvalue/associatedArray.length)<associatedArray.length)
				associatedArray[hashvalue/associatedArray.length] = givenArray[i];
		}
	}
	
	public int lookUp(int toLookUp){
		int hashValue = hash(toLookUp);
		int index = hashValue/associatedArray.length;
		return index;
	}
	
	public int hash(int givenValue){
		return 2*givenValue;
	}
	
 	
	//Test
	public static void main(String args[]){
		int[] temp= new int[]{1,4,6,9,18};
		MyHashTable myHashTable = new MyHashTable(temp);
		System.out.print(myHashTable.lookUp(6));
	}
	
}
