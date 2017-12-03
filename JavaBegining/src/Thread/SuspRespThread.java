package Thread;
	
class ThreadMine implements Runnable {
	Thread thrd;
	
	boolean suspended;
	boolean stopped;
	
	ThreadMine(String name) {
		thrd = new Thread(this, name);
		suspended = false;
		stopped = false;
		thrd.start();
	}
	
	//this is the entry point for thread
	public void run() {
		System.out.println(thrd.getName() + " starting.");
		try {
			for (int i = 1; i < 1000; i++) {
				System.out.print(i + " ");
				if ((i%10) == 0) {
					System.out.println();
					Thread.sleep(250);
				}
				
				// use synchronize block to check suspended and stopped
				synchronized(this) {
					while(suspended) {
						wait();
					}
					if (stopped) break;
				}
			}
		} catch (InterruptedException exc) {
			System.out.println(thrd.getName() + " interrupted.");
		}
		System.out.println(thrd.getName() + " exiting.");
	}
	
	// stop the thread
	synchronized void mystop() {
		stopped = true;
		suspended = false;
		notify();
	}
	
	// suspended the thread
	synchronized void mysuspend() {
		//stopped = false;
		suspended = true;
		//notify();
	}
	
	// resume the thread
	synchronized void myresume() {
		//stopped = false;
		suspended = false;
		notify();
	}
}	

public class SuspRespThread {
	public static void main (String args[]) {
		ThreadMine ob1 = new ThreadMine("My Thread");
		
		try {
			Thread.sleep(1000); // let ob1 start to execute
			
			ob1.mysuspend();
			System.out.println("Thread suspended.");
			Thread.sleep(1000);
			
			ob1.myresume();
			System.out.println("Thread resumed.");
			Thread.sleep(1000);
			
			ob1.mysuspend();
			System.out.println("Thread suspended.");
			Thread.sleep(1000);
			
			ob1.myresume();
			System.out.println("Thread resumed.");
			Thread.sleep(1000);
			
			ob1.mysuspend();
			System.out.println("Stopping thread.");
			ob1.mystop();
		} catch (InterruptedException exc) {
			System.out.println("Main thread interrupted.");
		}
		
		// wait for thread for finished
		
		try {
			ob1.thrd.join();
		} catch (InterruptedException exc) {
			System.out.println("Main thread interrupted.");
		}
		System.out.println("Main thread exiting");
	}
}