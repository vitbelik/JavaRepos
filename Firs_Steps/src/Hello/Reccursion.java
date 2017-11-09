package Hello;

class Factorial {
	int faceR(int i) {
		int result;
		if(i==1) return 1;
		result = faceR(i-1) * i;
		System.out.print(result +" ");
		return result;
	}
	
	int faceI(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) result *= i;
			System.out.print(result +" ");
		return result;

	}
}

public class Reccursion {
	public static void main (String args[]) {
		Factorial f = new Factorial();
	
		System.out.println("Factorial using reccursive method: ");
		System.out.println("Factorial of 3 is: " + f.faceR(3));
		System.out.println("Factorial of 4 is: " + f.faceR(4));
		System.out.println("Factorial of 5 is: " + f.faceR(5));
	
		System.out.println("Factorial using iterative method: ");
		System.out.println("Factorial of 3 is: " + f.faceI(3));
		System.out.println("Factorial of 4 is: " + f.faceI(4));
		System.out.println("Factorial of 5 is: " + f.faceI(5));
	}
}