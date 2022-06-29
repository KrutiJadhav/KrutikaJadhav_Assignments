package com.cg.exceptionhandling;

public class UnsupportedOperationExceptionExample {

	public static void main(String[] args) {
		
		int a = 6;
		int b = 3;
		
		try {
			//int c=a/b;
			System.out.println(a/b);
		}
		catch (ArithmeticException e) {
			//Exception handler
			System.out.println("A number cannot be divided by 0");
		}
	}
	 public static int divide(int a, int b) throws UnsupportedOperationException{
	        if(b==0){
	            throw new UnsupportedOperationException("Exception");
	        }
	        return a/b;
	    }
	}
	class UnsupportedOperationException extends Exception{
	    UnsupportedOperationException(String exception){
	        super(exception);
	    }
	}
	