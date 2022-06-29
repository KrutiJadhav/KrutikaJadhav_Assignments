package com.cg.exceptionhandling;

public class divideOperation {

	public static void main(String[] args) {
		int a = 6;
		int b = 3;
		try {
			System.out.println(a/b);
		}
		catch (ArithmeticException e) {
			
			//Exception handler
			System.out.println("A number cannot be divided by 0");
		}
	}
}
