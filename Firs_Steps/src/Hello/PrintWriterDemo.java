package Hello;
import java.io.*;

public class PrintWriterDemo {
	public static void main (String args[]) throws IOException { 
		int i = 100;
		double b = 12.2;
		double c = 13.4;
		String sop = "sophisticated";
		
		PrintWriter pr = new PrintWriter(System.out, true);
		
		pr.println("Using a print writer: ");
		pr.println(b + " this is a b;");
		pr.println(c + " this is a c;");
		pr.println(sop);
		
	}
}
