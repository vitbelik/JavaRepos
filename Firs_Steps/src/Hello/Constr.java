package Hello;
import java.util.Scanner;
//Создайте массив целых чисел, заполните его только четными числами, 
//а затем каждый второй элемент умножьте на предидущий. Используйте все варианты циклов.

public class Constr {
	static Scanner input = new Scanner(System.in);
	public static void main(String args[]) 
	throws java.io.IOException{
		
		int cust_choice, res, i=10;
		
		//String cust = input.nextLine();
		//cust_choice = Integer.parseInt(cust);
		
		do {
			System.out.print("Add the number you want to factorial: ");
			String cust = input.nextLine();
			cust_choice = Integer.parseInt(cust);
			
			System.out.print("The result of fuctorial function: " + cust_choice + "! = ");
			
			res = 1;
			for (int n = cust_choice; n > 0; n--) {
				if (n != 1) System.out.print(n + "*");
				else System.out.print(n);
				res *= n;
			}System.out.println(" = " + res);
			i--;
		}while(i > 0);
		
	}
}