package HelpF;
import java.io.*;

class Help {
	String helpfile;
	
	Help (String fname) {
		helpfile = fname;
	}
	
	boolean helpOn (String what) {
		int ch;
		String topic, info;
		
		//Open the helpfile
		try (BufferedReader helpRdr = 
				new BufferedReader(new FileReader(helpfile))) {
			do {
				//read characters until # is found
				ch = helpRdr.read();
				if (ch == '#') {
					topic = helpRdr.readLine();
					if (what.compareTo(topic) == 0) {// find topic
						do {
							info = helpRdr.readLine();
							if (info != null) System.out.print(info);
						} while ((info != null) &&
							(info.compareTo("")) != 0);
						
						return true;
					}
				}
			} while (ch != -1);
		} catch (IOException exc) {
			System.out.println("Error accessing help file.");
			return false;
		}
		return false; //topic not found
	}
	
	//get a help topic
	String getSelection() {
		String topic = "";
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print("\nEnter topic: ");
		try {
			topic = br.readLine();
		} catch (IOException exc) {
			System.out.println("Error reading console.");
		}
		
		return topic;
	}
	
	//class
}



public class FileHelp {
	public static void main (String args[]) {
		String choice;
		
		Help fileOb = new Help("helpfile.txt");
		
		System.out.println("Try the help system\n " + 
						"Print 'stop' to finish");
		do {
			choice = fileOb.getSelection();
			if (choice.equals("stop")) System.out.println("Programm interrupting!");
			else if (!fileOb.helpOn(choice)) System.out.println("No such topic!\n");
			
		} while (choice.compareTo("stop") != 0);
		
	}

}
