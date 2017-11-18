package Hello;

public class MultiCatch {
	public static void main (String args[]) {
		int a = 88, b = 0;
		char [] list  = {'A', 'B', 'C'};
		int result;
		
		for (int i = 0; i < 2; i++) {
			try {
				if (i == 0) result = a/b;
				else list[4] = 'X';
			}
			catch (final ArithmeticException | ArrayIndexOutOfBoundsException exc) {
				System.out.println("Exception is occured: " + exc);
			}
		}
		System.out.println("After for");
	}
}
