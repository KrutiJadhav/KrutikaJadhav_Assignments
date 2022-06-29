package com.cg.assignment3;

public class InsertString {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("It is used to__");
		
		StringBuffer sb2 = new StringBuffer(" at the specified index position");
		
		System.out.println("Input: " + sb1 + sb2);
		
		//Appending
		StringBuffer sb3 = new StringBuffer();
		sb3.append("insert text");
		System.out.println("Output: " + "It is used to " +sb3 +sb2  );

	}

}
