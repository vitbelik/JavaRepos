package Hello;

public class readCharacterFromKeyboard {
	public static void main(String args[])
		throws java.io.IOException{
		
		char ch;
		
		System.out.println("Enter a key from keyboard followed by ENTER :");
		
		ch = (char) System.in.read();
		
		System.out.println("Your char is " + ch);
	}
}
