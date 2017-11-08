package Hello;
import java.util.Scanner;

public class GalTOLit {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Please, choose what do you want to convert, " +
	"[litters -> gallons] jast write 'l' or [gallons -> litters] just write 'g'");
		String what = sc.nextLine();
		if (what.equals("l")) {
			System.out.print(" litters is " +LitToGals() + " gallons");
		}
		else if (what.equals("g")) {
			System.out.print(" gallons is " + GalToLits() + " litters");
		}
		else {
			System.out.println("Ooops! Incorrect value. We interrupt this programm!!!");
		}
	}
	//method which convert litters to gallons
	public static String LitToGals() {
		double value = 0.2642;
		return process(value);
	}
	//method which convert gallons to litters
	public static String GalToLits() {
		double value = 3.7854;
		return process(value);
	}
	//method which get the value from the command line and convert it into double
	public static double getValue() {
		System.out.print("Enter a value you want to convert: ");
		double entered_value = Double.parseDouble(sc.nextLine());
		return entered_value;
	}
	// method processed the result of calculation
	public static String process(double value) {
		double entered_value = getValue();
		double convert_value = value * entered_value;
		System.out.print(entered_value);
		return Double.toString(convert_value);
	}
}
