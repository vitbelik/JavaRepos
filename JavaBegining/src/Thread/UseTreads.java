package Thread;

class MyThreads1 implements Runnable {
	String thrdName;
	
	MyThreads1(String name) {
		thrdName = name;
	}
	
	// Entry point of tread
	public void run () {
		System.out.println(thrdName + " strating...");
		try {
			for (int count = 0; count < 10; count ++) {
				Thread.sleep(400);
				System.out.println("In " + thrdName + " , count is "
									+ count);
			}
		} catch (InterruptedException exc) {
			System.out.println(thrdName + " interrupted!");
		}
	System.out.println (thrdName + " terminating...");
	}
}

public class UseTreads {
	public static void main (String args[]) {
		System.out.println("Main thread starting.");
		
		MyThreads1 mt = new MyThreads1("Child #1");
		
		Thread newThrd = new Thread(mt);
		
		newThrd.start();

		
		for(int i = 0; i<50; i++) {
			System.out.print(".");
			try {
				Thread.sleep(100);
			}catch (InterruptedException exc) {
				System.out.println("Main thread interrupted!");
			}
		}
		System.out.println("Main thread ending.");
	}
}
