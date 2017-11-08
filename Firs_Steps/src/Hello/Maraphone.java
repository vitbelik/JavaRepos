package Hello;

public class Maraphone {
	int minimum_val;
	int index;
	String name;
	String names[];
	
	Maraphone(int value[], String namess[]){
		minimum_val = min(value);
		index = get_index(value);
		names = namess;
		name = get_name(index, names);	
	}
	
	private int min(int x[]) {
		
		int mval = 0;
		
		for (int i = 1; i < x.length; i++) {
			if (mval == 0) mval = x[1];
			else if (x[i-1] < x[i] & x[i-1] < mval) mval = x[i-1];
			else if (x[i-1] > x[i] & x[i] < mval) mval = x[i];
			//System.out.println("This is x[i-1] " + x[i-1] + " This is x[i] " + x[i]+ " This is mval " + mval );
			}
		return mval;
		}
			
	public int get_index(int array[]) { 
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == min(array)) {
				index = i;
			}
		}
		return index;		
	}
	
	//two methods (get_index and min) should be merged in one
	
	public String get_name(int index, String names_array[]) {
		return names_array[index];
	}
	
	public static void main (String args[]) {
		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", 
				"Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };

		int[] x = { 341, 273, 278, 329, 445, 1, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };
		
		Maraphone array_x = new Maraphone (x, names);
		//System.out.print(array_x.);

		System.out.println("Name: " + array_x.name + ", value: " + array_x.minimum_val + 
							", index: " + (array_x.index + 1));
	}
}

