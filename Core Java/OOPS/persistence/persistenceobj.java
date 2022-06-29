package com.cg.persistence;

public class persistenceobj {
	
	public static void main(String[] args) {
		
		Persistence obj= new Persistence() {
			
			@Override
			public void persist() {
				
				System.out.println("call persist obj");
				}
			};
			obj.persist();
	}
}
