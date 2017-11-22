package Trainin_with_book;
import java.io.*;

public class RWData {
	public static void main (String args[]) throws IOException {
		int i = 10;
		double o = 2014.13;
		boolean s = true;
		
		
		try (DataOutputStream foo = 
				new DataOutputStream(new FileOutputStream("filename"))) {
			
			System.out.println("Writing: " + i);
			foo.writeInt(i);
			System.out.println("Writing: " + o);
			foo.writeDouble(o);
			System.out.println("Writing: " + s);
			foo.writeBoolean(s);
		} catch (IOException exc) {
			System.out.println("Errjr while writing");
		}
		
		try (DataInputStream fob = 
				new DataInputStream(new FileInputStream("filename"))) {
			
			i = fob.readInt();
			System.out.println("Reading: " + i);
			o = fob.readDouble();
			System.out.println("Reading: " + o);
			s = fob.readBoolean();
			System.out.println("Reading: " + s);
		} catch (IOException exc) {
			System.out.println("I/O Exception");
		}
	}
}
