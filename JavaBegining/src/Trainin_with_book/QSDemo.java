package Trainin_with_book;

class QuickSort{
	
	// Set up a call to the actual QuickSort method
	static void qsort(char items[]) {
		qs(items, 0, items.length-1);
	}
	
	// A recursive version of QuickSort method
	private static void qs(char items[], int left, int right) {
		
		int i, j;
		char x, y;
		
		i = left; j = right;
		x = items[(left + right)/2];
		
		do {
			while ((items[i] < x) && (i < right)) i++;
			while ((x < items[j]) && (j > left)) j--;
			
			//while ((items[left] < x) && (left < right)) left++;
			//while ((x < items[right]) && (right > left)) right--;
			
			if ( i <= j ) {
				y = items[i];
				items[i] = items[j];
				items[j] = y;
				i ++; j --;
			}
		} while (i <= j);
		
		if (left < j) qs(items, left, j);
		if (i < right) qs(items, i, right);
		
	}
}
//d e g l n p y


public class QSDemo {
	public static void main (String args[]) {
		char[] arr_char = {'l', 'e', 'd', 'g', 'p', 'y', 'n'};
		QuickSort.qsort(arr_char);
		
		for (int i = 0; i < arr_char.length; i++)
			System.out.print(arr_char[i] + " ");
		
	}
}
