package com.cg.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class removeOddLength {
	
	public static void main(String[] args) {
		
		ArrayList<String> a=new ArrayList<String>();
		
		a.add("Winning");
		a.add("awarded");
		a.add("through");
		a.add("hardwork");
				
		Predicate<String> length = l -> l.length() % 2 != 0;
		
		a.removeIf(length);

		System.out.println(a);				
	}
}
