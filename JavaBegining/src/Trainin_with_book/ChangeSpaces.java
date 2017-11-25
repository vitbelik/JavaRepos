package Trainin_with_book;
import java.io.*;


class DefFile {
	
	String filename;
	String filen;
	
	DefFile(String fn, String fn_w) {
		filename = fn;
		filen = fn_w;
		
	}
	
	void writeText() {
		int ch;
		try (BufferedReader br = 
				new BufferedReader(new FileReader(filename));
			BufferedWriter bw = 
				new BufferedWriter(new FileWriter(filen))) {
			
			do {
				ch = br.read();
				if (((char) ch == ' ')) ch = '-';
				if (ch != -1) bw.write((char) ch);
			} while (ch != -1);
		} catch (IOException exc) {
			System.out.println("IOException!");
		}
	}
}

public class ChangeSpaces {
	public static void main (String args[]) {
		
		char s;
		DefFile fl = new DefFile("this.txt", "that.txt");
		fl.writeText();
		System.out.println("Done!");
		
	}
}