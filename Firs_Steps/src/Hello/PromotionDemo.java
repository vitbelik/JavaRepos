package Hello;

public class PromotionDemo {
	public static void main(String args[]) {
		byte b; int i;
		
		b = 10;
		i = b * b;
		
		b = (byte) (b*b);
		System.out.println("i and b " + i + " " + b);
		
		char ch1 = 'a', ch2 = 'b';
		ch1 = (char) (ch1 + ch2);
		System.out.println("ch1 " + ch1 + ", ch2 " + ch2);
	}
}
