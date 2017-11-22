package Trainin_with_book;
import java.io.*;

public class SystemReadFirst {
	public static void main (String args[]) 
	throws IOException {
		byte data[] = new byte[10];
		
		System.out.println("Enter some values: ");
		System.in.read(data);
		System.out.print("You wrote: ");
		for (int i = 0; i < data.length; i++) {
			System.out.print((char) data[i] + " ");
		}
		
	}
}
