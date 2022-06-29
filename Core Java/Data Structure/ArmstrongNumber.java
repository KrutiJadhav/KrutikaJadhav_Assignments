public class ArmstrongNumber {

	public static void main(String[] args) {
		int n=153, temp, Armstrong=0;
		int original=n;
		while(n>0)
		{
			temp= n%10;
			temp= (int) Math.pow(temp, 3);
			Armstrong= Armstrong + temp;
			n= n/10;
		}
		if(Armstrong == original)
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");

	}

}
