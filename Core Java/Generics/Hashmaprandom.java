package com.cg.generics;
import java.util.HashMap;

public class Hashmaprandom{
	
	public static void main(String[] args) {
		
		HashMap<Integer, Double> hm=new HashMap<Integer, Double>();
		hm.put((int) (Math.random()*100), Math.random());
		hm.put((int) (Math.random()*100), Math.random());
		hm.put((int) (Math.random()*100), Math.random());
		hm.put((int) (Math.random()*100), Math.random());
		hm.put((int) (Math.random()*100), Math.random());
		hm.put((int) (Math.random()*100), Math.random());
		hm.put((int) (Math.random()*100), Math.random());
		hm.put((int) (Math.random()*100), Math.random());
		hm.put((int) (Math.random()*100), Math.random());
		hm.put((int) (Math.random()*100), Math.random());
		for(java.util.Map.Entry<Integer, Double> i:hm.entrySet())
			
			//to store random values in systevm
			
		System.out.println(i);
		System.out.println(hm);
	}
}
