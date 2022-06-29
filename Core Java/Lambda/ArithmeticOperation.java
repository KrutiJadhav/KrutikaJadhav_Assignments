package com.cg.lambda;

import java.util.function.BiFunction;

public class ArithmeticOperation {

	public static void main(String[] args) {
		
		//Lambda exp for addition
		BiFunction <Integer, Integer, Integer> funcAddObj =(i1, i2) -> i1+i2;
		
		//Lambda exp for subtraction
				BiFunction <Integer, Integer, Integer> funcSubtractObj =(i1, i2) -> i1-i2;
				
				//Lambda exp for multiply
				BiFunction <Integer, Integer, Integer> funcMultiplyObj =(i1, i2) -> i1*i2;
				
				//Lambda exp for division
				BiFunction <Integer, Integer, Integer> funcModuloObj =(i1, i2) -> i1/i2;
				
				System.out.println("Addition of 20 and 10: " + funcAddObj.apply(20,10));
				System.out.println("Subtraction of 20 and 10: " + funcSubtractObj.apply(20,10));
				System.out.println("Multiplication of 20 and 10: " + funcMultiplyObj.apply(20,10));
				System.out.println("Division of 20 and 10: " + funcModuloObj.apply(20,10));
	}

}
