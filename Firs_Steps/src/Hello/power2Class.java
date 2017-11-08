package Hello;

public class power2Class {
	public static void main(String args[]) {
		int e, i, result;
		for(i = 0; i < 10; i++) {
			result = 1;
			e = i;
			while(e > 0) {
				result *= 2;
				e--;
			}
			System.out.println("2 to the " + i + " power " + result);
		}
	}
}
