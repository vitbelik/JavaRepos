package Generic;

class Gen<T> {
	T ob; // declare an object of type T
	
	// pass the constructor a reference of type T
	
	Gen(T o) {
		ob = o;
	}
	
	T getob() {
		return ob;
	}
	
	//show type of T
	void showType() {
		System.out.println("Type of T is " + ob.getClass().getName());
	}	
}

public class GenDemo {
	public static void main (String args[]) {
		// Creates a Gen reference for Integers.
		
		Gen<Integer> iOb;
		
		iOb = new Gen<Integer>(88);
		
		iOb.showType();
		
		int v = iOb.getob();
		System.out.println("Value of v is " + v);
		
		System.out.println();
		Gen<String> strOb = new Gen<String>("Hello Word!!!");
		strOb.showType();
		
		String str = strOb.getob();
		System.out.println("Value of str is " + str);
		
	}
}
