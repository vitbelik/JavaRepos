package Trainin_with_book;
import java.io.*;


public class FileOutputDemo {
	public static void main (String args[]) 
	throws IOException {
		
		int i;
		FileInputStream first = null;
		FileOutputStream second = null;
		
		if (args.length != 2) {
			System.out.println("Usage: FileOutput Demo firstFile secondFile");
			System.out.println("This program copy all info from firstFile to secondFile");
			return;
		}
		
		try {
			first = new FileInputStream(args[0]);
			second = new FileOutputStream(args[1]);
			
			do {
				i = first.read();
				if (i != -1) second.write(i);
			} while (i != -1);
			
		} catch (FileNotFoundException exc) {
			System.out.println("File Was Not Found");
		} catch (IOException exc) {
			System.out.println ("I/O Exception was occurred, see for the information" + exc);
		}
		
		finally {
			try {
				if (first != null && second != null) {
					first.close();
					second.close();
				}
			} catch (IOException exc) {
				System.out.println ("I/O Exception was occurred!");
			}
		}
	}
}
