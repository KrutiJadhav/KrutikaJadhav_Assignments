package com.cg.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class UsingHashSet {

	public static void main(String[] args) {
		
		//Hashset declaration
		HashSet<String> hset = new HashSet<String>();
		
		//Adding elements to HashSet
		hset.add("MI Redmi");
		hset.add("Nokia");
		hset.add("Realme");
		hset.add("Samsung");
		
		//Adding duplicate records
		hset.add("Nokia");
		hset.add("Realme");
		
		//adding 3 null elements and by default it ignores all and takes only 1 as null
		hset.add(null);
		
		//Display hashset objects
		System.out.println(hset);
		
		//Additional use of ArrayList
		ArrayList<String> mobiles = new ArrayList<String>();
		System.out.println("Here are few brands of mobile phones: " + hset);
	}
}

