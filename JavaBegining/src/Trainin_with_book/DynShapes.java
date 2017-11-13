package Trainin_with_book;

class TwoDShape12{
	private double width;
	private double heigth;
	private String name;
	
	TwoDShape12(){
		heigth = width = 0;
		name = "none";
	}
	
	TwoDShape12(double w, double h, String n){
		heigth = h;
		width = w;
		name = n;
	}
	
	TwoDShape12(double x, String n) {
		width = heigth = x;
		name = n;
	}
	
	TwoDShape12(TwoDShape12 ob) {
		width = ob.width;
		heigth = ob.heigth;
		name = ob.name;
	}
	
	//accessor method
	double getWidth() {return width; }
	void setWidth(double w) { width = w; }
	double getHeigth() {return heigth; }
	void setHeigth(double h) { heigth = h; }
	String getName() { return name; }


	void showDim() {
		System.out.println("Width and heigth are " + width + " and " + heigth);
	}
	
	double area() {
		System.out.println("This is the area: ");
		return 0.0;
	}
}

class Triangle12 extends TwoDShape12 {
	private String style;
	
	Triangle12() {
		super();
		style = "none";
	}
	
	Triangle12(double w, double h, String s) {
		super(w, h, "triangle");
		
		style = s;
	}
	
	Triangle12(double x) {
		super(x, "triangle");
		
		style = "filled";
	}
	
	Triangle12(Triangle12 ob) {
		super(ob);
		style = ob.style;
	}
	
	double area() {
		return getWidth() * getHeigth() /  2;
	}
	
	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}

class Rectangle extends TwoDShape12 {
	
	Rectangle() {
		super();
	}
	
	Rectangle(double w, double h) {
		super(w, h, "rectangle");
	}
	
	Rectangle(double x) {
		super(x, "rectangle");
	}
	
	Rectangle(Rectangle ob) {
		super(ob);
	}
	
	boolean isSquared() {
		if(getWidth() == getHeigth())  return true;
		return false;
	}
	
	double area() {
		return getWidth() * getHeigth();
	}
}


public class DynShapes {
	public static void main (String args[]) {
		TwoDShape12 shapes[] = new TwoDShape12[5];
		
		shapes[0] = new Triangle12(8.0, 12.0, "outlined");
		shapes[1] = new Rectangle(10);
		shapes[2] = new Rectangle(10, 4);
		shapes[3] = new Triangle12(7.0);
		shapes[4] = new TwoDShape12(10, 20, "generic");
		
		for (int i = 0; i < shapes.length; i++) {
			System.out.println("object is " + shapes[i].getName());
			System.out.println("Area is " + shapes[i].area());
			System.out.println();

		}
 	}
}
