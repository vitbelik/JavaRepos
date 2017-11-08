package Hello;

public class inch_converting {
	public static void main(String args[]) {
		int meters, counter = 0;
		double metr, inches, inch = 39.37; //1 meter = 39.37 inches
		
		for(meters = 1; meters < 100; meters++) {
			inches = meters*inch;
			System.out.println(meters + " meters is " + inches + " inches \r ");
			counter++;
			if (counter == 12) {
				System.out.println();
				counter = 0;
			}		
		}
	}
}
