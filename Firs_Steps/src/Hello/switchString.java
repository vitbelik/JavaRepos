package Hello;
import java.util.Scanner;

public class switchString {
	static Scanner sc = new Scanner(System.in);
	public static void main (String args[]) {
		
		
		System.out.print("Please, add your command: ");
		String option = sc.nextLine();
		
		switch (option) {
			case "canceled":
				System.out.println("Poressing cancelling....");
				break;
			case "submit":
				System.out.println("Poressing submiting....");
				break;
			case "disconnect":
				System.out.println("Poressing Disconnecting....");
				break;
			default:
				System.out.println("Incorrect option!!!");
		}		
	}
}
