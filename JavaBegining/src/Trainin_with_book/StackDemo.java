package Trainin_with_book;

class Stack {
	private char s[];
	private int top, nop;
	
	Stack(int size) {
		s = new char [size];
		top = 0;
		//nop = s.length - 1;
	}
	
	Stack(char a[]) {
		s = new char [a.length];
		
		for (int i = 0; i < a.length; i++)
			push(a[i]); 
			
	}
	
	void push (char ch) {
		
		if (top == s.length) System.out.println("This list is empty");
		s[top] = ch;
		top++;
	}
	
	char pop() {
 
		if (top == 0) System.out.println("Stack is full...");
		top --;
		return s[top];
	}	
}

public class StackDemo {
	public static void main (String args[]) {
		char ch;
		
		Stack ob1 = new Stack(8);
		
		
		System.out.println("This is the list ob1: ");
		for (int i = 0; i < 8; i++ ) {
			ob1.push((char) ('a' + i));
		}
		for (int i = 0; i < 8; i++ ) {
			ch = ob1.pop();
			System.out.print(ch);
		}
	}
}