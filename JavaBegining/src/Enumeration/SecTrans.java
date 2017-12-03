package Enumeration;

enum Transp {
	CAR(60), AIRPLANE(600), TRUCK(50), TRAIN(70);
	
	private int speed;
	
	Transp(int s){
		speed = s;
	}
	
	int getSpeed() { return speed; }
}

public class SecTrans {
	public static void main (String args[]) {
		Transp  tp;
		
		System.out.println("Airplane speed is " + Transp.AIRPLANE.getSpeed() + "\n");
		
		for(Transp t : Transp.values()) {
			System.out.println(t + " speed is " + t.getSpeed() + " miles per hour");
		}
	}
}
