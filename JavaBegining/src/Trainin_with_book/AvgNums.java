package Trainin_with_book;
import java.io.*;


public class AvgNums {
	public static void main (String args[]) throws IOException {
		double sum = 0.0, d, avg;
		int i = 0;
		String str;
		
		System.out.print("Enter, how many values do you want to carch: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine();
		System.out.println("Entered " + str + " values");
			
		try {
			i = Integer.parseInt(str);
		} catch (NumberFormatException exc) {
			System.out.println("Incorrect number format:   " +
								" Ussage: int");
			i = 0;
		}
			
		for (int j = 0; j < i; j++) {
			try {
				System.out.print(": ");
				str = br.readLine();
				d = Double.parseDouble(str);
			} catch (NumberFormatException exc) {
				System.out.println("Incorrect number!");
				d = 0.0;
				j -= 1;
			}
				
			sum += d;
		}
		avg = sum / i;
		System.out.println("Avarage: " + sum + " / " + i + " = " + avg);
		
	}
}
