package Hello;


public class SCops {
	public static void main(String args[]) {
		int n = 10, d = 2, g;
		
		if(d != 0 && (n % d) == 0)
			System.out.println(d + " is a factor of1 " + n);
		
		d = 0;
		
		if(d != 0 && (n % d) == 0) //
			System.out.println(d + " is a factor of2 " + n);
		
		if(d != 0 && (n % d) == 0) //if I have only one '&' - java look for all impression.. till (n%d)==0.
			System.out.println(d + " is a factor of3 " + n);
		

	}
}

