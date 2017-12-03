package Enumeration;

enum Transportp {
	CAR, AIRPLANE, TRUCK, TRAIN
}

public class EnumDemo2 {
	public static void main(String args[]) {
		Transportp tp;
		
		tp = Transportp.CAR;
		
		System.out.println("This is my assigned " +tp);
		
		Transportp allTransport[] = 	Transportp.values();
		for(Transportp t: allTransport) {
			System.out.println(t);
		}
		
		System.out.println();
		tp = Transportp.valueOf("AIRPLANE");
		System.out.println("This is valueOF() " + tp);
	}
}
