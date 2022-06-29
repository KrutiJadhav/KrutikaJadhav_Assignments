package com.stringbuilder.assignment3;

public class InsertString {

	public static void main(String[] args) {
		
		StringBuilder str1 = new StringBuilder("It is used to__");
		
		StringBuilder str2 = new StringBuilder(" at the specified index position");
		
		System.out.println("Input: " + str1.toString() +str2.toString());
		
		//Appending
		StringBuilder str3 = new StringBuilder("insert text");
		//sb.setCharAt(3,"insert text");
		System.out.println("Output: " + "It is used to " + str3.toString() + str2.toString());
	}

}
