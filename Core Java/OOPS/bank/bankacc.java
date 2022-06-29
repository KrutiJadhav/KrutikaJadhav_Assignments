package com.cg.bank;

public class bankacc {
	
	public static void main(String[] args) {
			
			SavingsAccount s1 = new SavingsAccount(101,"Kruti",50000);
			SavingsAccount s2 = new SavingsAccount(102,"Gayatri",70000);
			CurrentAccount c1 = new CurrentAccount(201, "Sudheer", 50000);
			CurrentAccount c2 = new CurrentAccount(202, "Shobha", 100000);
			
			System.out.println("Account Holder:" +s1.getAccountHolder()+"----"+"Balance:"+ s1.getBalance());
			System.out.println("Account Holder:" +s2.getAccountHolder()+"----"+"Balance:"+ s2.getBalance());
			System.out.println("Account Holder:" +c1.getAccountHolder()+"----"+"Balance:"+ c1.getBalance());
			System.out.println("Account Holder:" +c2.getAccountHolder()+"----"+"Balance:"+ c2.getBalance());
	}
}
