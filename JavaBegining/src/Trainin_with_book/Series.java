package Trainin_with_book;

public interface Series {
	
	int getNext(); // return next number of series
	
	default int[] getNextArray(int n) {
		int [] vals = new int[n];
		
		for (int i = 0 ; i < n; i++) vals[i] = getNext();
		return vals;
	}
	
	void reset(); // restart
	void setStart(int x); // set starting value
}
