package Trainin_with_book;

class TwoDShape {
	private double width;
	private double heigth;
	
	double getWidth() {
		return width;
	}
	double getHeigth () {
		return heigth;
	}
	void setWidth(double w) { 
		width = w; 
	}
	void setHeigth(double h) {
		heigth = h;
	}
	


}

class Triangle extends TwoDShape {
	String style;
	
	Triangle (String s, double w, double h) {
		setWidth(w);
		setHeigth(h);
		
		style = s;
		
	}
	
	double sqr() {
		return getWidth() * getHeigth() / 2;
	}
	
	void style() {
		System.out.println("The style is " + style + " style");
	}
}

public class Shapes {
	public static void main (String args[]) {
		Triangle ob1 = new Triangle("well", 4.0, 5.0);
		
		System.out.println("Square = " + ob1.sqr());
		ob1.style();
		
	}
}
