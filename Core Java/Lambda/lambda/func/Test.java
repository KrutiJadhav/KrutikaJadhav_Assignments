package com.lambda.func;

import java.util.function.Function;

public class Test {
	
	  public static void main(String[] args) {
		  
	    int n = 5;
	    modifyTheValue(n, val-> val + 10);
	    modifyTheValue(n, val-> val * 100);
	  }
	  static void modifyValue(int v, Function<Integer, Integer> function){
	    int result = function.apply(v);
	    System.out.println(newValue);
	  }
}
