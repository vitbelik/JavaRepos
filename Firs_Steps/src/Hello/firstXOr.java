package Hello;

public class firstXOr {
	public static void main (String args[]) {
		String msg = "This is a text";
		String encmsg = "";
		String decmsg = "";
		long key = 270587945;
		
		System.out.println("Original message: " + msg);
		
		for (int i = 0; i < msg.length(); i++)
			encmsg = encmsg + (char) (msg.charAt(i) ^ key);
		
		System.out.println("Encoding message: " + encmsg);
		
		for (int i = 0; i < encmsg.length(); i++)
			decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);
		
		System.out.println("Decoding message: " + decmsg);
	}
}
