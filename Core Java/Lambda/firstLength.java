package com.cg.lambda;

import java.util.ArrayList;
import java.util.List;

public class firstLength {
	
	public static void main(String[] args) {
		
		StringBuilder build = new StringBuilder();
		
		List<String> join = new ArrayList<>();

		join.add("Where");
		join.add("there");
		join.add("is a");
		join.add("will");
		join.add("there");
		join.add("is a");
		join.add("way");
		
		// Consumer interface
		join.forEach(t -> build.append(t.charAt(0)));
		
		System.out.println("The resultant string using string builder");
		System.out.println(build);
	}
}