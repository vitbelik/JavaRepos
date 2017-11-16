package Interfaces;

class FixedQueue implements ICharQ {
	private char q[]; // this array holds the queue
	private int putlock, getlock; // the put and get indices
	
	
	// Construct an empty queue given it size
	public FixedQueue(int size) {
		q = new char[size]; // allocate memory for queue
		putlock = getlock = 0;
	}
	
	// Put a character into a queue
	public void put(char ch) {
		if (putlock==q.length) {
			System.out.println("- Queue is full.");
			return;
		}
		
		q[putlock++] = ch;
	}
	
	// Get a character from the queue
	public char get() {
		if (putlock == getlock) {
			System.out.println("Queue is empty");
			return (char) 0;
		}
		return q[getlock++];
	}
	
	public void reset() {
		putlock = getlock = 0;
	}
}

class CircullarQueue implements ICharQ {
	private char q[]; // this array hold the queue;
	private int getlock, putlock; // the put and get indicators
	
	// Construct an empty queue given it size
	public CircullarQueue(int size) {
		q = new char[size + 1]; // allocate memory for queue
		putlock = getlock = 0;
	}	
	
	// put the character into the queue
	public void put(char ch) {
		/*Queue is full if putlock is one less then the getlock,
		 * or if putlock is at the end of the array and getlock
		 * is at the beginning*/
		if(putlock+1 == getlock |
			((putlock==q.length) & (getlock == 0))) {
			System.out.println("- Queue is full.");
			return;
		}
		q[putlock++] = ch;
		if(putlock == q.length) putlock = 0; // loop back
	}
	
	//Get character from the queue
	public char get() {
		if(getlock == putlock) {
			System.out.println("- Queue is empty");
			return (char) 0;
		}
		char ch = q[getlock++];
		if (getlock == q.length) getlock = 0;
		return ch;
	}
	
	public void reset() {
		putlock = getlock = 0;
	}
}

class DinQueue implements ICharQ {
	private char q[]; // this array hold the queue;
	private int getlock, putlock; // the put and get indicators
	
	// Construct an empty queue given it size
	public DinQueue(int size) {
		q = new char[size];
		putlock = getlock = 0;
	}
	
	//Put char into the queue
	public void put(char ch) {
		if (putlock==q.length) {
			//increase queue size
			char[] t = new char[q.length * 2];
			
			//copy elements into new queue
			for (int i = 0; i < q.length; i++)
				t[i] = q[i];
			
			q = t;
		}
		
		q[putlock++] = ch;
	}
	
	//get character from the queue
	public char get() {
		if(getlock == putlock) {
			System.out.println("- Queue is empty");
			return (char) 0 ;
		}
		
		return q[getlock++];
	}
	
	public void reset() {
		putlock = getlock = 0;
	}
}

public class IQDemo {
	public static void main (String args[]) {
		FixedQueue q1 = new FixedQueue(10);
		DinQueue q2 = new DinQueue(5);
		CircullarQueue q3 = new CircullarQueue(10);
		
		ICharQ iQ;
		
		char ch;
		int i;
		
		iQ = q1;
		//put some characters into fixed queue
		for (i = 0; i < 10; i++)
			iQ.put((char) ('A' + i));
				
		//Show the queue
		iQ.reset();
		System.out.print("Context of fixed queu: ");
		for (i = 0; i < 10; i++) {
			ch = iQ.get();
			System.out.print(ch); 
		}
		System.out.println();
		
		iQ = q2;
		//put some characters into dynamic queue
		for (i = 0; i < 10; i++)
			iQ.put((char) ('Z' - i));
				
		//Show the queue
		System.out.print("Context of Dynamic queu: ");
		for (i = 0; i < 10; i++) {
			ch = iQ.get();
			System.out.print(ch); 
		}
		System.out.println();
		
		iQ = q3;
		//put some characters into circular queue
		for (i = 0; i < 10; i++)
			iQ.put((char) ('A' + i));
				
		//Show the queue
		System.out.print("Context of Circullar queu: ");
		for (i = 0; i < 10; i++) {
			ch = iQ.get();
			System.out.print(ch); 
		}
		System.out.println();	
		
		//put more characters into circullar queue
		for (i = 10; i < 20; i++)
			iQ.put((char) ('A' + i));
				
		//Show the queue
		System.out.print("Context of Circullar queu: ");
		for (i = 0; i < 10; i++) {
			ch = iQ.get();
			System.out.print(ch); 
		}
		
		System.out.println("\nStore and consume from " + 
							"circular queue ");
		
		//store in and consume from circular queue
		for (i = 0; i < 28; i++) {
			iQ.put((char) ('A' + i));
			ch = iQ.get();
			System.out.print(ch);
		}
	}
}
