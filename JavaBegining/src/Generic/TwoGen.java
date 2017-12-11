package Generic;

class TGen<T, V> {
	T ob1;
	V ob2;
	
	TGen(T o1, V o2) {
		ob1 = o1;
		ob2 = o2;
	}
	
	void showTypes() {
		System.out.println("The type of T is " + ob1.getClass().getName());
		System.out.println("The type of V is " + ob2.getClass().getName());
	}
	
	T getob1() { return ob1; }
	V getob2() { return ob2; }
}

public class TwoGen {
	public static void main (String args[]) {
		TGen<Integer, String> u1 = new TGen<Integer, String>(99, "WTF?");
		
		u1.showTypes();
		
		int i = u1.getob1();
		String str = u1.getob2();
		
		System.out.println("Value of ob1 is: " + i);
		System.out.println("Value of ob2 is: " + str);

	}
}
