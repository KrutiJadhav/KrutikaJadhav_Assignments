import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		
		System.out.println("Enter your current CTC: ");
		double ctc=sc.nextDouble();
		//System.out.println("Enter your annual savings: ");
		//double d=sc.nextDouble();
		//double ir=ctc-d;
		double ir=ctc;
		
		int taxper=0;
		if(ir<=180000) {
			taxper=0;
		}
		else if(ir>=180001 && ir<=300000) {
		taxper=10;
			}
		
		else if(ir>=300001 && ir<=500000) {		
		taxper=20;
			}
		else {//ir<=1000000
			taxper=30;
		}
		
	double tax=ir*taxper/100;
	
	//System.out.println("Taxable income: " + ir);
	System.out.println("Income Tax: " + tax);
	}
}

