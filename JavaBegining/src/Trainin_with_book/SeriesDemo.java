package Trainin_with_book;

class ByTwos implements Series {
	int start;
	int val;
	int priv;
	
	ByTwos() {
		start 	= 0;
		val 	= 0;
		priv 	= 0;
	}
	
	public int getNext() {
		priv = val;
		val += 2;
		return val;
	}
	
	public void reset() {
		val = start;
	}
	
	public void setStart(int x) {
		start = val = x;
	}
	
	int getPriv() {
		return priv;
	}
	
}



public class SeriesDemo {
	public static void main (String args[]) {
		ByTwos bo = new ByTwos();
		
		System.out.println("Starting...");
		for (int i = 0; i < 5; i++)
			System.out.println("Next value is: " + bo.getNext());
		
		System.out.println("\nSetting new value... \nnew value is 90");
		bo.setStart(90);
		
		System.out.println("\nStarting...");
		for (int i = 0; i < 5; i++)
			System.out.println("Next value is: " + bo.getNext());
		
		System.out.println("Prev: " + bo.getPriv());
		
		System.out.print("\nNext array: " + "[");
		int k[] = bo.getNextArray(20);
		for (int i = 0; i < k.length; i++ ) {
			System.out.print(k[i]);
			if(i != k.length -1) System.out.print(", ");
		}
		System.out.print("]");
		
	}
}
