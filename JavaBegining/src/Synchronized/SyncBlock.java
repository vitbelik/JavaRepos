package Synchronized;

class SumArrayT {
	private int sum;
	
	int SumArrayT(int nums[]) {
		sum = 0;
		
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
			System.out.println("Running total for " +
								Thread.currentThread().getName() +
								" is " + sum);
			try {
				Thread.sleep(10); // allow task switch
			} catch (InterruptedException exc) {
				System.out.println("Thread interrupted!");
			}
		}
		return sum;
	}
}

class MYThreadT implements Runnable {
	Thread thrd;
	SumArrayT sa = new SumArrayT();
	int a[];
	int answer;
	
	// construct a new thread
	MYThreadT(String name, int nums[]) {
		thrd = new Thread(this, name);
		a = nums;
		thrd.start();	
	}
	
	// begin execution of new thread
	public void run() {
		int sum;
		
		System.out.println(thrd.getName() + " starting.");
		
		synchronized(sa) {
			answer = sa.SumArrayT(a);	
		}
		
		System.out.println("Sum for " + thrd.getName() + 
							" is " + answer);
		
		System.out.println(thrd.getName() + " terminating.");
	}	
}




public class SyncBlock {
	public static void main (String args[]) {
		int a[] = {1, 2, 3, 4, 5};
		
		MYThread mt = new MYThread("Child #1", a);
		MYThread mt1 = new MYThread("Child #2", a);
		
		try {
			mt.thrd.join();
			mt1.thrd.join();
		} catch (InterruptedException exc) {
			System.out.println("Main thread interrupted.");
		}
		
	}
}