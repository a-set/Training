package com.sethspace.training;

public class MyStringBuilder {
	
	char[] value;
	
	int count;
	
	public MyStringBuilder(){
		count =0;		
	}
	
	public void printString(){
		for(int i=0;i<value.length;i++)
			System.out.print(value[i]);
		System.out.println();
	}
	
	public MyStringBuilder(String str){
		value = new char[str.length()];
		for(int i=0;i<str.length();i++)
			value[i] = str.charAt(i);
		count = str.length();
	}
	
	public MyStringBuilder append(String str){
		
		count = count + str.length();//new count
		char[] temp ;//Placeholder array
		if(count  > value.length){//Check if the new string is greater than the allocated array size
			if(count > 2*value.length)//yes ? Then check if doubling the array size would help
				temp = new char[count];//use the count to create a new array
			else
				temp = new char[2*value.length];//just double the array
			for(int i=0;i<value.length;i++)//Copy data from the old array
				temp[i] = value[i];//Copy the new value
			for(int i=value.length;i<count;i++)
				temp[i] = str.charAt(i-value.length);
			value = temp;
		}
		return this;
	}
	
	//Testing
	public static void main(String args[]){
		MyStringBuilder a = new MyStringBuilder("Something of some sort");
		MyStringBuilder b = new MyStringBuilder(" another thing I wanted to say");
		a.append("thisprogramran").printString();
		b.append("Something just happened").printString();
		
	}

}
