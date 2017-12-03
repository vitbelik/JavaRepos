package Thread;

class my_Thread implements Runnable {
	Thread thrd;
	
	my_Thread(String name) {
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

public class JoinThreads {
	public static void main(String args[]) {
		System.out.println("Main thread starting...");
		
		myThread mt = new myThread("Child #1");
		myThread mt1 = new myThread("Child #2");
		myThread mt2 = new myThread("Child #3");
		
		
		
		try {
			mt.thrd.join();
			System.out.println("Child #1 joined");
			mt1.thrd.join();
			System.out.println("Child #2 joined");
			mt2.thrd.join();
			System.out.println("Child #3 joined");
		} catch (InterruptedException exc) {
			System.out.println("Main thread interrupted.");
		}
		System.out.println("Main thread ends.");
	}
}


