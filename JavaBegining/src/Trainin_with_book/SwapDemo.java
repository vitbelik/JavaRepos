package Trainin_with_book;

class Test {
	int a;
	
	Test(int i) {
		a = i;
	}
	
	void swap (Test k, Test s) {
		int temp;
		
		temp = k.a;
		k.a = s.a;
		s.a = temp;
	}
}

public class SwapDemo {
	public static void main (String args[]) {
		Test ob1 = new Test(6);
		Test ob2 = new Test(8);
		
		System.out.println("This is ob1 before swap method: " + ob1.a);
		System.out.println("This is ob2 before swap method: " + ob2.a);
		System.out.println();
		
		ob2.swap(ob1, ob2);
		
		System.out.println("This is ob1 after swap method: " + ob1.a);
		System.out.println("This is ob2 after swap method: " + ob2.a);
	}
}
