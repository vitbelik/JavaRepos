package Hello;

public class LenghtDemo {
	public static void main (String args[]) {
		
		int i;
		int num1[] = new int [10];
		int num2[] = new int [10];
		
		for (i = 0; i < num1.length; i++)
			num1[i] = i;
		
		if(num2.length >= num1.length) {
			for(i = 0; i < num1.length; i++)
				num2[i] = num1[i];
		}
		for (i=0; i < num2.length; i++)
			System.out.print(" " + num2[i] );
	}
}
