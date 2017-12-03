package Thread;

class Priority implements Runnable {
	int count;
	Thread thrd;
	static boolean stop = false;
	static String currentName;
	
	Priority(String name) {
		thrd = new Thread(this, name);
		count = 0;
		currentName = name;
	}
	
	public void run() {
		System.out.println(thrd.getName() + " starting.");
		do {
			count ++;
			
			if (currentName.compareTo(thrd.getName()) != 0) {
				currentName = thrd.getName();
				System.out.println("In " + currentName);
			}
		} while (stop == false && count < 10000000);
		
		stop = true;
		
		System.out.println("\n" + thrd.getName() + 
						" terminating.");
	}
	
}

public class PriorityDemo {
	public static void main (String args[]) {
		Priority mt1 = new Priority("High Priority");
		Priority mt2 = new Priority("Low Priority");
		
		//set priorities
		mt1.thrd.setPriority(Thread.NORM_PRIORITY + 2);
		mt2.thrd.setPriority(Thread.NORM_PRIORITY - 2);
		
		mt1.thrd.start();
		mt2.thrd.start();
		
		try {
			mt1.thrd.join();
			mt2.thrd.join();
		} catch (InterruptedException exc) {
			System.out.println("Interupted!");
		}
		
		System.out.println("\nHight priority thread counter to " +
							mt1.count);
		System.out.println("\nLow priority thread counter to " +
				mt2.count);
	}
}
