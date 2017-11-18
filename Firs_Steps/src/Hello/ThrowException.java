package Hello;

public class ThrowException {
	public static void main (String args[]) {
		System.out.println("Begin to do smth...");
		try {
			System.out.println("Before throwing an exception");
			throw new ArithmeticException();
		}
		catch (ArithmeticException exc) {
			System.out.println("Exception was rised.");
		}
		System.out.println("After try block");
	}
}
