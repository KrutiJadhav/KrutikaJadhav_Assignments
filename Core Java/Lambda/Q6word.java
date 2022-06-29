package com.cg.lambda;
		
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Q6word {
	
	public static void main(String[] args) {
		
		List<String> join = new ArrayList<>();
		
		join.add("where");
		join.add("there");
		join.add("is a");
		join.add("will");
		join.add("there");
		join.add("is a");
		join.add("way");
		join.replaceAll(new change());
		
		join.stream().collect(Collectors.toList()).forEach(System.out::println);
	}
}

class change implements UnaryOperator<String> {
	
	@Override
	public String apply(String s) {
		
		return s.toUpperCase();
	}
}