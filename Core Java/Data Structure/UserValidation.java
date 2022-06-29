import java.util.Scanner;

public class UserValidation {

	public static void main(String[] args) {
		String username;
		String password;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your username: ");
		username=sc.nextLine();
		
		System.out.println("Enter your password: ");
		password=sc.nextLine();
	
		if(username.equals("kruti") && password.equals("jadhav@123"))
		{
			System.out.println("Welcome");
		}
		else {
			int count=0;
			for(int i=1;i<3;i++)
		{
			System.out.println("Invalid credentials");
			System.out.println("Enter Username");
			username=sc.next();
			System.out.println("Enter Password");
			password=sc.next();
			
			if(username.equals("kruti") && password.equals("jadhav@123"))
			{
			System.out.println("Welcome " + username);
			break;
		}
		count ++;
	}
	if(count==2)
			System.out.println("Contact Admin");
	}
	}
}