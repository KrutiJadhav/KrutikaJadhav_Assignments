package com.cg.lambda;

import java.util.HashMap;

public class SingleString {
	
	public static void main(String[] args) {
		
		StringBuilder mix = new StringBuilder();
		
		HashMap<Integer, String> aa = new HashMap<>();
		
		aa.put(1, "Have");
		aa.put(2, "Enterpreneurship");
		aa.put(3, "Get");
		aa.put(4, "Succeeded");
		// this method will make the key value pairs a string using string builder
		
		aa.entrySet().forEach(t -> mix.append(t));
		
		System.out.println(mix);
	}
}
