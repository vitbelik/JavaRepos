package Trainin_with_book;

public class varArgs {
	
	static void testVal(int ... v){
		System.out.println("number of vals: " + v.length);
		System.out.println("contents");
		
		for (int i = 0; i < v.length; i++)
			System.out.println("arg " + i + " : " + v[i]);
		System.out.println();
	}
	
	public static void main (String args[]) {
		
		testVal();
		testVal(33);
		testVal(1, 2, 3);
		
		
		
	}
}
