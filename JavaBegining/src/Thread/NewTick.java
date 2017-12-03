package Thread;

class TickTocks {
	
	String state;
	
	synchronized void tick(boolean running) {
		if(!running) {//stop the clock
			state = "ticked";
			//notify();
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
			//notify();
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

class MyTse implements Runnable {
	Thread thrd;
	TickTocks ttob;
	
	// Construct new thread
	MyTse (String name, TickTocks tt) {
		thrd = new Thread(this, name);
		ttob = tt;
		thrd.start();
	}
	
	// begin execution
	public void run() {
		try {
			if(thrd.getName().compareTo("Tick") == 0) {
				for(int i = 0; i < 5; i++) {
					ttob.tick(true);
					thrd.sleep(500);
				}
				ttob.tick(false);
			}
			else {
				thrd.sleep(500);
				for(int i = 0; i < 5; i++) {
					ttob.tock(true);
					thrd.sleep(500);
				}
				ttob.tock(false);
			}

		} catch (InterruptedException exc) {
			System.out.println("Ssd");
		}		
	}
}

	
public class NewTick {
	public static void main (String args[]) {
		TickTocks tt = new TickTocks();
		MyTse mt1 = new MyTse("Tick", tt);
		MyTse mt2 = new MyTse("Tock", tt);
		
		try {
			mt1.thrd.join();
			mt2.thrd.join();
		} catch (InterruptedException exc) {
			System.out.println("Main thread interrupted.");
		}
	}
}
