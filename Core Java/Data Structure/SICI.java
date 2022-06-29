public class SICI {

	public static void main(String[] args) {
		//SI=(Prinpl*rate*time)/100
		float p=1200;
		double r=1.3;
		float t=6;
		double SI=(p*r*t)/100;
		System.out.println("Simple Interest: "+ SI);
		
		//CI=P(1+r)^n n=no. of days
		double amt;
		double principal=1000;
		double rate=1.1;
		for(int days=1;days<=10;days++)
		{
			amt=principal*Math.pow(1+rate, days);
			System.out.println(days+" "+amt);
		}
	}

}
