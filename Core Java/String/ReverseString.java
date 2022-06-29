package com.cg.assignment3;

public class ReverseString {

	public static void main(String[] args) {
		
		//String created by creating obj of stringbuffer class
		StringBuffer s = new StringBuffer("This method returns the reverse object"
				+ "on which it was called");
		System.out.println("Input: " +s);
		
		//reverse method
		s.reverse();
		
		System.out.println("Reversed output: " +s);
	}

}
