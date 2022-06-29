package com.stringbuilder.assignment3;

	public class ReverseString {

		public static void main(String[] args) {
			
			//String created by creating obj of stringbuffer class
			StringBuilder string= new StringBuilder("This method returns reverse object on which it was called");
			System.out.println("Input: " +string.toString());
			
			//reverse method
			string.reverse();
			
			System.out.println("Reversed output: " +string);
		}
	}
