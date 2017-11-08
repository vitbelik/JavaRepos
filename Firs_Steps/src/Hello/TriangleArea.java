package Hello;
import java.util.Scanner;


public class TriangleArea {
	
	static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) {
		double base;
		double height;
		
		System.out.print("Enter triangle's base: ");
		base = sc.nextDouble();
		
		System.out.println("Enter triangle's height: ");
		height = sc.nextDouble();
		
		double area = (base*height)/2;
		
		System.out.println("Your answer is: " + area);
	}
}