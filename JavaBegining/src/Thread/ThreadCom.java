package Thread;

class TickTock {
	
	String state;
	
	synchronized void tick(boolean running) {
		if(!running) {//stop the clock
			state = "ticked";
			notify();
			return;
		}
		
		System.out.print("Tick ");
		
		state = "ticked"; // set the current state to ticked
		
		notify(); // let tock() run
		try {
			while(!state.equals("tocked"))
				wait();
		}
		catch (InterruptedException exc) {
			System.out.println("Thread interrupted.");
		}
	}
	
	synchronized void tock(boolean running) {
		if(!running) {//stop the clock
			state = "tocked";
			notify();
			return;
		}
		
		System.out.println("Tock");
		
		state = "tocked";
		
		notify();
		try {
			while(!state.equals("ticked"))
				wait();
		}
		catch (InterruptedException exc) {
			System.out.println("Thread interrupted.");
		}
	}
}

class MyTs implements Runnable {
	Thread thrd;
	TickTock ttob;
	
	// Construct new thread
	MyTs (String name, TickTock tt) {
		thrd = new Thread(this, name);
		ttob = tt;
		thrd.start();
	}
	
	// begin execution
	public void run() {
		if(thrd.getName().compareTo("Tick") == 0) {
			for(int i = 0; i < 5; i++) ttob.tick(true);
			ttob.tick(false);
		}
		else {
			for(int i = 0; i < 5; i++) ttob.tock(true);
			ttob.tock(false);
		}
	}
}

	
public class ThreadCom {
	public static void main (String args[]) {
		TickTock tt = new TickTock();
		MyTs mt1 = new MyTs("Tick", tt);
		MyTs mt2 = new MyTs("Tock", tt);
		
		try {
			mt1.thrd.join();
			mt2.thrd.join();
		} catch (InterruptedException exc) {
			System.out.println("Main thread interrupted.");
		}
	}
}
