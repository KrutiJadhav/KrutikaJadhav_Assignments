package com.cg.oops;

public class SingleTone {
	
	private static SingleTone singleton = null;
	private SingleTone() {
		
	}
	
	public static SingleTone getInstance() {
		if (singleton == null) {
		singleton = new SingleTone();
		}
		return singleton;
	}
	
	public static void main(String[] args) {
		SingleTone obj1 = SingleTone.getInstance();
		System.out.println(obj1);

		SingleTone obj2 = SingleTone.getInstance();
			System.out.println(obj2);
		}

	}

