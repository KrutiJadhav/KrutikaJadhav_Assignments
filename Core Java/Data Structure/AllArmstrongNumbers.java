import java.util.Scanner;

public class AllArmstrongNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the range");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		AllArmstrongNumbers(a,b);
	}
	
	static void AllArmstrongNumbers(int a, int b) {
		for(int i=a; i<=b; i++) {
			int num=i;
			int sum=0;
			
			while(num>0) {
				int remainder = num %10;
				sum = sum + (remainder*remainder*remainder);
				num=num/10;
			}
			if(sum==i) {
				System.out.println(sum);		
			}
		}

	}

}
