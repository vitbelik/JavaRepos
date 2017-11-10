package Hello;

class Queue1 {
	
	private char q[]; //this array holds the queue
	private int putloc, getloc; // the put and get indices
		
	Queue (int size){
		q = new char[size]; //allocate memory for queue
		putloc = getloc = 0;
	}
	
	Queue(Queue ob){
		putloc = ob.putloc;
		getloc = ob.getloc;
		q = new char[ob.q.length];
		
		//copy elements
		for (int i = getloc; i < putloc; i++)
			q[i] = ob.q[i];
	}
	
	Queue(char a[]){
		putloc = 0;
		getloc = 0;
		q = new char[a.length];
		
		for (int i = 0; i < a.length; i++) put(a[i]);
	}
	
	void put(char ch) {
		if(putloc == q.length) {
			System.out.println("- Queue is full.");
			return;
		}
		
		q[putloc++] = ch;
	}
	
	char get() {
		if(getloc == putloc) {
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}
		return q[getloc++];
	}
}

class newQueue {
	public static void main (String args[]) {
		
		Queue q1 = new Queue(10);
		
		char name[] = {'T', 'o', 'm'};
		Queue q2 = new Queue(name);
		
		char ch;
		int i;
		
		//put some characters into q1
		for (i = 0; i < 10; i++)
			q1.put((char) ('A' + i));
			
		//construct queue from another queue
		Queue q3 = new Queue(q2);
		
		//Show the queues
		System.out.println("Content of the q1 ");
		for (i = 0; i < 10; i++) {
			ch = q1.get();
			System.out.print(ch);
		}
		
		System.out.println("\n");
		
		System.out.println("Content of the q3: ");
		for (i = 0; i < 10; i++) {
			ch = q3.get();
			System.out.print(ch);
		}
	}
			
		
		/*
		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(4);
		char ch;
		int i;
		
		System.out.println("Using a BIG Queue to store the alphabet");
		for (i = 0; i < 26; i++)
			bigQ.put((char) ('A' + i) );
		
		System.out.print("Contents of bigQ: ");
		for (i = 0; i < 26; i++) {
			ch = bigQ.get();
			if (ch != (char) 0) System.out.print(ch);
		}
		
		System.out.println("\n");
		
		System.out.println("Using small queue to generate errors");
		
		for(i = 0; i < 5; i++) {
			System.out.print("Attempting to store " +
					(char) + ('Z' - i));
		smallQ.put((char) ('Z' - i));
		
		System.out.println();
		
		
		}
	
		System.out.print("Content of small queue");
		for (i = 0; i < 5; i++) {
			ch = smallQ.get();
			if (ch != (char) 0) System.out.print(" " + ch);
		}
	}
		*/
}



