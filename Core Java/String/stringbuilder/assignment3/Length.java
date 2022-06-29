package com.cg.assignment3;

public class Length {

	public static void main(String[] args) {
//Initialized a string variable
		//String str="Hello World";
		
		//Initialized character array
		char chars[]= {'H','e','l','l','o','W','o','r','l','d'};
		
		//Initialized count variable which will store the length
		//int count=str.length();
		
		String str=new String(chars);
		
		//Print the count of length variable
		//System.out.println("String has " + count + " characters");
		
		System.out.println("String has " +str.length()+ " characters");
	}
}