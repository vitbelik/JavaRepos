package Hello;
import java.io.*;

public class BufferedReader_1 {
	public static void main (String args[]) throws IOException{
		char ch;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Write some letters and press [Enter]: ");
		
		do {
			ch = (char) br.read();
			System.out.println(ch);
			
		}while (ch != '.');
		
	}
}
