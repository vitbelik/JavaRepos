package Trainin_with_book;

class Str {
	String val;
	
	Str (String s) {
		val = s;
	}
	
	char[] procStr() {
		char[] temp = new char[100];
		for ( int i = 0; i < val.length(); i++ )
			temp[i] = val.charAt(i);
		return temp;
		
	}
	
	String[] createStr(char[] k) {
		boolean check = true;
		int g = 0;
		String[] temp = new String[100];
		String t = "";
		for (int i = 0; i < k.length; i++)
			if(k[i] == ' ') {
				check = false;
				temp[g] = t;
				t = "";
			}
			else if ( check ) { t += k[i]; }
		
		return temp;
	}
	
}

public class simple {
	public static void main (String args[]) {
		Str sop = new Str("hello my friend");
		char p[] = sop.procStr();
		
		String j[] = sop.createStr(p);
		
		for(int i = 0; i < j.length; i++)
			System.out.print(j[i]);
	}
}
