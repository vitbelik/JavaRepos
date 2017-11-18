package Hello;

public class ExceptionHandlingFirst {
	public static void main(String args[]) {
		int numbers1[] = {2, 4, 43, 35, 65, 76, 99};
		int numbers2[] = {2, 2, 3, 0, 12, 19};
		
		for (int i = 0; i < numbers1.length; i++) {
			try {
				System.out.println("Number " + numbers1[i] + " devided by " + numbers2[i] + 
						" is " + numbers1[i]/numbers2[i]);
			}
			catch (ArithmeticException except) {
				System.out.println("Cannot devided by zero!");
			}
			catch (Throwable exept) { //ArrayIndexOutOfBoundsException
				System.out.println("OOOooooOooops... Index out of range");
			}
		}
	}
}
