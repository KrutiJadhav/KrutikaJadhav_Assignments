package com.cg.assignment3;

public class StringClass {

	public static void main(String[] args) {
		String s1="Java String pool refers to collection of Strings which are stored in heap memory";
		
		//sentence converted to lowercase
		String s1lower=s1.toLowerCase();
		System.out.println(s1lower);
		
		//sentence converted to uppercase
		String s1upper=s1.toUpperCase();
		System.out.println(s1upper);
		
		//replace a to $
		String replace=s1.replace('a', '$');
		System.out.println(replace);
		
		
		//to search a word collection
		System.out.println(s1.contains("collection"));
		
		//matches original
		String strOriginal=s1;
		String str="java string pool refers to collection of strings which are stored in heap memory";
		int intIndex = strOriginal.indexOf(str);
		
		if(intIndex==-1) {
			System.out.println("Original Sentence mismatched");
		}
		else {
			System.out.println("Matched with original data at index: "+ intIndex);
		}
		
		//another method to equal sentence ignoring case
		System.out.println(s1.equalsIgnoreCase(str));
			
	}

}
