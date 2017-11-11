package Trainin_with_book;

class Var{
	void varargs(int ... s) {
		int sum = 0;
		
		for (int i = 0; i < s.length; i++)
			sum += s[i];
		System.out.print("Sum of your arguments = " + sum);
		//return sum;
	}
}

public class myVarArg {
	public static void main (String args[]) {
		Var ob = new Var();
		ob.varargs(12, 23, 10, 11);
	}
}
