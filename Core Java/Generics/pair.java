package com.cg.generics;
import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class pair {
	
	public static void main(String[] args) {
		Map<String ,String> tm=new TreeMap<String, String>();
		
		tm.put("1", "hello");
		tm.put("2","beautiful");
		tm.put("3","nature");
		tm.put("4","is awaiting..!");
		
		System.out.println(tm);
		
		Map<String ,LocalDate> tm1=new TreeMap<String,LocalDate>();
		tm1.put("1",LocalDate.now());
		
		System.out.println(tm1);
	}
}
