package Trainin_with_book;
import java.io.*;


public class RandomAccessDemo {
	public static void main (String args[]) {
		
		double data[] = { 19.4, 10.1, 123.54, 33.0, 87.9, 74.25 };
		double d;
		
		try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")) {
			
			//write value to the file
			for (int i = 0; i < data.length; i++) {
				raf.writeDouble(data[i]);
			}
			for (int i = 0; i < data.length; i++) {
				System.out.print(data[i] + " ");
			}
			
			System.out.println("\n");
			
			//Now read back specific values
			raf.seek(0); // seek to first double
			d = raf.readDouble();
			System.out.println("First value is: " + d);
			
			raf.seek(8);
			d = raf.readDouble();
			System.out.println("Second value is: " + d);
			
			raf.seek(8 * 3);
			d = raf.readDouble();
			System.out.println("Fourth value is: " + d);
			
			System.out.println();
			
			// Read every other value
			System.out.println("This is every other values");
			for (int i = 0; i < data.length; i+=2) {
				raf.seek(8 * i); // seek to i-th double
				d = raf.readDouble();
				System.out.print(d + " ");
			}
		} catch (IOException exc) {
			System.out.println("I/O Error: " + exc);
		}
	}
}
