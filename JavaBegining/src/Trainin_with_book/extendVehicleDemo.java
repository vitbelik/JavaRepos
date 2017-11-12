package Trainin_with_book;

class Vehicle {
	private int fuelcamp;
	private int passengers;
	private int mpg;
	
	Vehicle (int p, int f, int m) {
		fuelcamp = f;
		passengers = p;
		mpg = m;
	}
	
	int range() {
		return mpg * fuelcamp;
	}
	
	double fuelneed(int miles) {
		return (double) miles / mpg;
	}
	
	//accessor methods for vehicle
	int getPassengers() { return passengers; }
	void setPassengers(int pas) { passengers = pas; }
	int getFuelcamp() { return fuelcamp; }
	void setFuelcamp(int fuel) { fuelcamp = fuel; }
	int getMpg() { return mpg; }
	void setMpg(int m) { mpg = m; }
	
}

class Truck extends Vehicle {
	private int cargocap;
	
	Truck(int p, int f, int m, int c) {
		super(p, f, m);
		cargocap = c;
	}
	
	int getCargo() { return cargocap; }
	void putCargo(int g) { cargocap = g; }
}

public class extendVehicleDemo {
	public static void main (String args[]) {
		Truck semi = new Truck(2, 200, 7, 44000);
		Truck picup = new Truck(3, 28, 15, 2000);
		double gallons;
		int dist = 252;
		
		gallons = semi.fuelneed(dist);
		
		System.out.println("Semi can carry " + semi.getCargo() + " pounds.");
		System.out.println("To do " + dist + " miles semi needs " + gallons + " gallons of fuel.");
		
		gallons = picup.fuelneed(dist);
		
		System.out.println("Picup can carry " + picup.getCargo() + " pounds.");
		System.out.println("To do " + dist + " miles pickup needs " + gallons + " gallons of fuel.");
		
		System.out.println("This is mpg before setting " + semi.getMpg());
		semi.setMpg(10);
		
		System.out.println ("This is mpg after setting " + semi.getMpg());
	}
}
