package Trainin_with_book;

class recS{
	String text;
	
	recS(String t){
		text = t;
	}
	
	void recT(int idx) {
		if (idx != text.length() - 1) recT(idx+1);
		System.out.print(text.charAt(idx));
	}
		
}

public class recurString {
	public static void main (String args[]) {
		recS ob = new recS("This is text");
		ob.recT(0);
	}
}
