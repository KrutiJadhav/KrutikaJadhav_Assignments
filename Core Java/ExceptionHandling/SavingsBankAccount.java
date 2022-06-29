package com.cg.exceptionhandling;

public class SavingsBankAccount{
	
	public static void main(String[] args) {
		
        Savingsaccount customer=new Savingsaccount(01,32000);
        System.out.println("Customer ID "+customer.getId());
 
        System.out.println("Savings Account Balance is: " + customer.getBalance());
        
        try {
            customer.withdraw(33000);
        }
        
        catch (InsufficientBalanceException e){
            System.out.println("Insufficient Balance");
        }
        
        catch (IlleagalBankTransactionException f){
            System.out.println(" Illegal Transaction amount entered is invalid");
        }
    }
}

class Savingsaccount{
    long id;
    double balance;

    public Savingsaccount(long Id,double balance){
        this.id=Id;
        this.balance=balance;
    }

    public void Deposit(double deposit) {
        balance=balance+deposit;
    }
    public long getId(){
        return id;
    }

    public double getBalance(){
        return balance;
    }
    public void withdraw(double Withdrawal) throws InsufficientBalanceException, IlleagalBankTransactionException{
        if(Withdrawal>balance || balance==0){
            throw new InsufficientBalanceException("Exception");
        }
        else if(Withdrawal<0){
            throw new IlleagalBankTransactionException("Exception");
        }
        balance=balance-Withdrawal;
        System.out.println("Amount Withdrawn is "+ Withdrawal );
    }

}
//Exception Class handling
class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String exception){
        super(exception);
    }
}
class IlleagalBankTransactionException extends Exception{
    IlleagalBankTransactionException(String exception){
        super(exception);
    }
}
