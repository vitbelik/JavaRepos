package Hello;
import java.util.Scanner;

public class Words {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print(ProcessWords());

	}	
	public static String ProcessWords() {
		String enteredWord = input.nextLine();
		
		if (enteredWord.equals("Hello!")) {
			return "Hello, Man!!! How are you?";
		}
		else {
			return "Fuck off!!!!";
		}
	}
}
