package Hello;

public class avrOfTenDouble {
	public static void main (String args[]) {
		
		double array [] = {647388, 35475, 256458, 87539, 10238, 11233, 4432, 5674, 2345, 901};
		double avrg = 0;
		double sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		avrg = sum / array.length;
		System.out.println("Avarage of this values of array is: " + avrg);

		
	}
}
