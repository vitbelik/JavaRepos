package Trainin_with_book;

class Outer {
	int nums[];
	
	Outer(int n[]){
		nums = n;
	}
	
	void analizy() {
		Inner x = new Inner(); 
		
		System.out.println("Mathemathikal...: ");
		System.out.println("Minimum: " + x.min());
		System.out.println("Maximum: " + x.max());
		System.out.println("Average: " + x.avg());
	}

	class Inner {
		
		int min() {
			
			int m = nums[0];
			for (int i = 0;  i < nums.length; i++)
				if (m > nums[i]) m = nums[i];
			return m;
		}
		
		int max() {
			
			int m = nums[0];
			for (int i = 0;  i < nums.length; i++)
				if (m < nums[i]) m = nums[i];
			return m; 
		}
		
		int avg() {
			
			int m = 0;
			for (int i = 0;  i < nums.length; i++)
				m += nums[i];
			return m/nums.length; 
		}

	}
}


public class NestedClassDemo {
	public static void main (String args[]) {
		int array[] = {2, 43, 12, 0, -2, 34, 21, 22, 9, 4};
		
		Outer k = new Outer(array);
		
		k.analizy();
	}
}
