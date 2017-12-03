package Thread;

class ThreadsMy implements Runnable {
	String name;
	Thread thrd;
	String currentName;
	static boolean stop = false;
	int sum;
	
	ThreadsMy(String name) {
		thrd = new Thread(this, name);
		currentName = name;
		thrd.start();
		sum = 0;
	}
	
	public void run() {
		
		System.out.println(thrd.getName() + " starting.");
		do {
			sum ++;
			
			if (currentName.compareTo(thrd.getName()) != 0) {
				currentName = thrd.getName();
				System.out.println("In " + currentName);
			}
		} while (stop == false && sum < 10000000);
		
		stop = true;
		
		System.out.println("\n" + thrd.getName() + 
						" terminating.");
	}
		
		/*System.out.println(thrd.getName() + " starting!");

		for (int i = 0; i < 100; i++) {
			
			if(currentname.compareTo(thrd.getName()) != 0) {
				sum += i;
				currentname = thrd.getName();
				System.out.println("This is currentname " + currentname + 
						" and getName() " + thrd.getName());
			}
		}
	}*/
}


public class TreadsMyTry {
	public static void main (String args[]) {
		ThreadsMy mt = new ThreadsMy("Child#1");
		//ThreadsMy mt1 = new ThreadsMy("Child#2");
		
		//mt.thrd.start();
		//mt1.thrd.start();
		
		try {
			mt.thrd.join();
			//mt1.thrd.join();
		} catch (InterruptedException exc) {
			System.out.println("OOps");
		}
				
		System.out.println("Mt1 summ " + mt.sum);
		//System.out.println("Mt2 sum" + mt1.sum);
		
	}
}
