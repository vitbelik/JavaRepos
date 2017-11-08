package Hello;

public class doWhileFirst {
	public static void main(String args[])
	throws java.io.IOException {
		char ch;
		
		do {
			System.out.println("Press any key followed by ENTER: ");
			ch = (char) System.in.read();
		}while(ch != 'q');
	}
}
