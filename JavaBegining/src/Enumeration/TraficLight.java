package Enumeration;

enum LightsColour {
	RED(12000), YELLOW(2000), GREEN(10000);
	
	private int duration;
	
	LightsColour(int i) {
		duration = i;
	}
	
	int getDelay() { return duration; }
}

class TraficLightsSimulator implements Runnable{
	private Thread thrd;
	private LightsColour tlc;
	boolean stop = false;
	boolean changed = false;
	
	TraficLightsSimulator(LightsColour init) {
		tlc= init;
		
		thrd = new Thread(this);
		thrd.start();
	}
	
	TraficLightsSimulator() {
		tlc = LightsColour.RED;
		
		thrd = new Thread(this);
		thrd.start();
	}
	
	public void run() {
		while(!stop) {
			/*try {
				switch(tlc) {
				case GREEN:
					Thread.sleep(10000); // green for 10 seconds
					break;
				case YELLOW:
					Thread.sleep(2000); // yellow for 2 seconds
					break;
				case RED:
					Thread.sleep(12000); // red for 12 seconds
					break;
				}
			} catch (InterruptedException exc) {
				System.out.println(exc);
			}*/
			try {
				for (LightsColour lt : LightsColour.values()) {
					if (tlc==lt) Thread.sleep(lt.getDelay());
				} 
			}catch (InterruptedException e) {
				System.out.println("OOops");
			}
			
			changeColour();
		}
	}
	
	synchronized void changeColour() {
		switch(tlc) {
		case RED:
			tlc = LightsColour.GREEN;
			break;
		case  YELLOW:
			tlc = LightsColour.RED;
			break;
		case GREEN:
			tlc = LightsColour.YELLOW;
			break;
		}
		changed = true;
		notify();
	}
	
	synchronized void WaitForChange() {
		try {
			while (!changed)
				wait();
			changed = false;	
		}catch (InterruptedException exc) {
			System.out.println(exc);
		}
	}
	
	synchronized LightsColour getColour() {
		return tlc;
	}
	
	synchronized void cancel() {
		stop = true;
	}
}

public class TraficLight {
	public static void main (String args[]) {
		TraficLightsSimulator t1 = 
				new TraficLightsSimulator(/*LightsColour.GREEN*/);
		
		for (int i = 0; i < 9; i++) {
			System.out.println(t1.getColour());
			t1.WaitForChange();
		}
		
		t1.cancel();
			
	}
}
