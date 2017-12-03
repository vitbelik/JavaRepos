package Synchronized;


class TheThread implements Runnable {
	Thread thrd;
	boolean suspended;
	boolean resumed;
	boolean stoped;
	
	TheThread(String name) {
		thrd = new Thread(this, name);
		stoped = false;
		suspended = false;
		resumed = false;
		thrd.start();
	}
		
		
	public void run() {	
		System.out.println(thrd.getName() + " starting.");
		try {
			for(int i = 0; i <= 60; i ++) {
				System.out.print(i + " ");
				thrd.sleep(1000);
				if (i > 0 && i%10 == 0) System.out.println();
			}
			
			System.out.println("Clock stopping!");
			
		/*	synchronized(this) {
				while (suspended ) {
					wait();
				}
			}*/
			
 		} catch (InterruptedException exc) {
 			System.out.println("Interuption!");
 		}
		
		
	}	 
}


public class myClock {
	public static void main(String args[]) {
		TheThread th = new TheThread("Clock");
		
		//System.out.println("Clock stoped");
	}
}
