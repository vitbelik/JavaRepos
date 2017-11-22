package Trainin_with_book;

import java.io.*;

public class FileOpen {
	public static void main (String args[]) 
	throws IOException {
		int i;
		FileInputStream fin = null;
		
		//1. we should open a file
		//2. read each line from file
		//3. close file
		
		
		if (args.length != 1) {
			System.out.println("Usage: FileOpen FileName");
			return;
		}
		
		try {
			fin = new FileInputStream(args[0]);
			//System.out.println(args[1]);
			do {
				i = fin.read();
				if (i != -1) System.out.print((char) i);
			} while (i != -1);
		} catch (FileNotFoundException exc) {
			System.out.println("File Not Found");
		} catch (IOException exc) {
			System.out.println("Error occured");
		}
		finally {
			try {
				if (fin != null) fin.close();
			} catch (IOException exc) {
				System.out.println("Error closing file");
			}
		}
	}
}