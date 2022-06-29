package com.cg.lambda;

import java.util.ArrayList;

public class threadPrintNumbers {
	
	public static void main(String[] args) {
		
		thread execute = new thread();
		
		System.out.println(Thread.currentThread());
		execute.start();
		
		}
	}

class thread extends Thread {
	
	public void run() {
			ArrayList<Integer> numbers = new ArrayList<>();
			numbers.add(11);
			numbers.add(22);
			numbers.add(33);
			numbers.add(78);
			numbers.add(98);
			numbers.add(45);
			numbers.add(1);
			numbers.add(189);
			
			// This will print the array list using a consumer function
			numbers.forEach(t -> System.out.println(t));
	}
}