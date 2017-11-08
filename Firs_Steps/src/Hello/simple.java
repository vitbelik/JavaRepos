package Hello;

public class simple {
	public static void main (String args[]) {
		int s = 87987;
		
		int count = 0;
		for ( int i = 65536; i > 0; i = i/2 ) {
			if ( (s & i) != 0 ) System.out.print("1 ");
			else System.out.print("0 ");
			count ++;
			if (count == 8) System.out.print(" ");
		}
		//s <<= 3;
		//System.out.println(s);
	}
}
//absval = val < 0 ? -val : val;