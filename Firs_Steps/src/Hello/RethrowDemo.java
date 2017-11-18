package Hello;

class Rethrow {
	public static void getException() {
		int numbers1[] = {2, 4, 43, 35, 65, 76, 99};
		int numbers2[] = {2, 2, 3, 0, 12, 19};
		
		for (int i = 0; i < numbers1.length; i++) {
			try {
				System.out.println("Number " + numbers1[i] + " devided by " + numbers2[i] + 
						" is " + numbers1[i]/numbers2[i]);
			}
			catch (ArithmeticException except) {
				System.out.println("Cannot devided by zero!");
				//throw except;
			}
			catch (ArrayIndexOutOfBoundsException exept) { //ArrayIndexOutOfBoundsException
				System.out.println("OOOooooOooops... Index out of range");
				throw exept;
			}
		}
	}
}

public class RethrowDemo {
	public static void main(String args[]) {
		try {
			Rethrow.getException();
		}
		catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("Fatal error..... -  program terminated");
		}
	}
}
