package Hello;
import java.io.*;

public class BufferedReader_2 {
	public static void main(String args[]) throws IOException {
		String str;
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Write long sentances or write 'quet' to exit: ");
		do {
			str = br.readLine();
			System.out.println(str);
		} while (!str.equals("quit"));
	}
}
