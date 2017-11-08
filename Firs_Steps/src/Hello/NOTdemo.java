package Hello;

public class NOTdemo {
	public static void main (String args[]) {
		byte b = -34;
		System.out.println(b);
		System.out.println();
		
		for (int i = 128; i > 0; i = i/2) {
			if ((b & i) != 0 ) System.out.print("1 ");
			else System.out.print("0 ");	
		}
		
		System.out.println();
			
		// reverse all bits
		b = (byte) ~b;
		System.out.println("This is b ~: " + b);
		
		for (int t = 128; t > 0; t = t/2) {
			if ( (b & t) != 0 ) System.out.print( "1 " );
			else System.out.print("0 ");
		}
	}
}
