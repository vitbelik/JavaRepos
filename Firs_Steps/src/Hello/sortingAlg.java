package Hello;

public class sortingAlg {
	public static void main (String args[]) {
		
		int arr[] = {5466, -123, 52234, 0, -45, 99, 1, 8, 23, 88};
		int count, size, a, b, temp;
		
		//size = arr.length;
		size = 10;
		
		for (a = 1; a < size; a++)
			for (b = size - 1; b >= a; b--)
				if (arr[b - 1] > arr[b]) {
					temp = arr[b];
					arr[b] = arr[b-1];
					arr[b-1] = temp;
				}
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
	}
}