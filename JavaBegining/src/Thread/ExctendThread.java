package Thread;

class mYThreads extends Thread {
	
	mYThreads(String name) {
		super (name);
		start();
	}
	
	// beging execution of thread
	public void run() {
		System.out.println(getName() + " starting.");
		try {
			for (int count = 0; count < 10; count ++) {
				Thread.sleep(400);
				System.out.println("In " + getName() + 
						", count is " + count);
			}
		} catch (InterruptedException exc) {
			System.out.println(getName() + " interrupterd.");
		}
		System.out.println(getName() + " terminated.");
	}
}

public class ExctendThread {
	public static void main(String args[]) {
		System.out.println("Main thread starting...");
		
		mYThreads mt = new mYThreads("Child #1");
		
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
