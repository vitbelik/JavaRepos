package Trainin_with_book;
import java.io.*;


public class FileOutputDemo {
	public static void main (String args[]) 
	throws IOException {
		
		int i;
		//FileInputStream first = null;
		//FileOutputStream second = null;
		
		if (args.length != 2) {
			System.out.println("\n------------------------------------------\n"
								+"Usage: FileOutput Demo firstFile secondFile");
			System.out.println("This program copy all info from firstFile to secondFile\n"
								+ "------------------------------------------\n");
			return;
		}
		
		try (FileInputStream first = new FileInputStream(args[0]); 
			 FileOutputStream second = new FileOutputStream(args[1])){
			//first = new FileInputStream(args[0]);
			//second = new FileOutputStream(args[1]);
			
			do {
				i = first.read();
				if (i != -1) second.write(i);
			} while (i != -1);
			System.out.println ("\n------------------------------------------\n"
								+ "Writing was compleated successfully!\n"
								+ "------------------------------------------\n");
		} catch (FileNotFoundException exc) {
			System.out.println("\n------------------------------------------\n"
								+ args[0] + " File Was Not Found\n" 
								+ "------------------------------------------\n");
		} catch (IOException exc) {
			System.out.println ("\n------------------------------------------\n"
								+ "I/O Exception was occurred, see for the information" + exc
								+ "\n------------------------------------------\n");
		}
		/*finally {
			try {
				if (first != null && second != null) {
					first.close();
					second.close();
				}
			} catch (IOException exc) {
				System.out.println ("I/O Exception was occurred!");
			}
		}*/
	}
}
