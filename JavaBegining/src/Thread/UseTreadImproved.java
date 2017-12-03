package Thread;

class myThread implements Runnable {
	Thread thrd;
	
	myThread(String name) {
		thrd = new Thread (this, name);
		thrd.start();
	}
	
	// beging execution of thread
	public void run() {
		System.out.println(thrd.getName() + " starting.");
		try {
			for (int count = 0; count < 10; count ++) {
				Thread.sleep(400);
				System.out.println("In " + thrd.getName() + 
						", count is " + count);
			}
		} catch (InterruptedException exc) {
			System.out.println(thrd.getName() + " interrupterd.");
		}
		System.out.println(thrd.getName() + " terminated.");
	}
}

public class UseTreadImproved {
	public static void main(String args[]) {
		System.out.println("Main thread starting...");
		
		myThread mt = new myThread("Child #1");
		myThread mt1 = new myThread("Child #2");
		myThread mt2 = new myThread("Child #3");
		
		for (int i = 0; i < 50; i++) {
			System.out.print(".");
			try {
				Thread.sleep(100);
			} catch (InterruptedException exc) {
				System.out.println("Main thread interrupted.");
			}
		}
		System.out.println("Main thread ends.");
	}
}
