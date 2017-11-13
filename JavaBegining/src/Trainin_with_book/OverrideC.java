package Trainin_with_book;

class A { 
	int i, j;
	
	A(int a, int b) {
		i = a;
		j = b;
	}
	
	void show() {
		System.out.println("i and j: " + i + " " + j);
	}
}

class B extends A {
	int c;
	
	B(int n, int m, int l){
		super(n, m);
		c = l;
	}
	
	void show() {
		super.show();
		System.out.println("c: " + c);
	}
}

public class OverrideC {
	public static void main(String[] args) {
		B subob = new B(1, 2 ,3);
		subob.show();
	}
}
