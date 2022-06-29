import java.util.Scanner;

public class AverageMarks {
	
	public static void main(String[] args) {
			int a,b,c;
			System.out.println("Enter marks of 3 subjects");
			
			Scanner sc=new Scanner(System.in);
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			
			//add the above subject marks
			int sum=a+b+c;
			System.out.println("Total marks are "+ sum);
			double avg=sum/3.0;
			System.out.println("Average marks" +avg);//to give us avg marks

		if(a>=60 && b>=60 && c>=60) //if all 3 subject marks are 60 or greater
		{
			System.out.println("Grade A");
		}
		else
		{
			if(a>=60 && b>=60 && c<60) //if any 2 subject marks are 60 or above
			{
				System.out.println("Grade B");
			}
			else //if all 3 subject marks are less then 60
			{
				System.out.println("Grade C");
			}
		}
		}
	}
