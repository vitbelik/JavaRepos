package Hello;

public class logicalOpTable {
	public static void main(String args[]) {
		
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT(p)");
		
		printSmth(true, true);
		printSmth(true, false);
		printSmth(false, true);
		printSmth(false, false);
		
		/*
		boolean p, q;
		
		p = true; q = true;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		
		p = true; q = false;
		System.out.print((p) + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		
		p = false; q = true;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		
		p = false; q = false;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p&q) + "\t" + (p|q) + "\t");
		System.out.println((p^q) + "\t" + (!p));
		*/
		
		
	}
	
	static void printSmth (boolean p, boolean q){
		System.out.printf("%s\t", p   ? "1" : "0");
		System.out.printf("%s\t", q   ? "1" : "0");
		System.out.printf("%s\t", p&q ? "1" : "0");
		System.out.printf("%s\t", p|q ? "1" : "0");
		System.out.printf("%s\t", p^q ? "1" : "0");
		System.out.printf("%s\t\n", !p  ? "1" : "0");
		}
}
