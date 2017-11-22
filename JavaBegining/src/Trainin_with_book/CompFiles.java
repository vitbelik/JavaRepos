package Trainin_with_book;
import java.io.*;


public class CompFiles {
	public static void main (String args[]) throws IOException{
		int i, j;
		int count = 0;
		int differ = 1;
		
		if(args.length != 2) {
			System.out.println("\nUsage: CompFile file1 file2");
			return;
		}
		
		try (FileInputStream inputS_1 = new FileInputStream(args[0]);
				FileInputStream inputS_2 = new FileInputStream(args[1])) {
			do {
				i = inputS_1.read();
				j = inputS_2.read();
				count += 1;
				if (i != j) {
					System.out.println("This position chars are differ: " + count + " chars are i [" + ((char) i) + "] and j [" + ((char) j) +"].");
					differ = 0;
					continue;
				}
			} while (i != -1 && j != -1);
			
			if (differ == 0) System.out.println("Files are different!!!");
			else System.out.println("Files are equal!!!");
			
		} catch (IOException exc) {
			System.out.println("Exception was occurred"); 
		}
	}
}
