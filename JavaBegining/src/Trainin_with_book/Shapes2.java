package Trainin_with_book;

class twoDDShape {
	private double width, heigth;
	
	twoDDShape(){
		width = heigth = 0.0;
	}
	
	twoDDShape(double w, double h){
		width = w;
		heigth = h;
	}
	
	twoDDShape(double x){
		width = heigth = x;
	}
	
	double getWidth() { return width; }
	double getHeigth() { return heigth; }
	void setWidth(double w) { width = w; }
	void setHeigth(double h) { heigth = h; }
	
}
	
	
class Tom extends twoDDShape{
	private String style;
	
	Tom() {
		super();
		style = "none";
	}
	
	Tom (double x) {
		super(x);
		style = "filled";
	}
	
	Tom (String s, double w, double h) {
		super(w, h);
		
		style = s;
	}
	
	double area() {
		return getWidth() * getHeigth() / 2;
	}
	
	String getStyle() {
		return style;
	}
}

public class Shapes2 {
	public static void main (String args[]) {
		Tom ob1 = new Tom();
		Tom ob2 = new Tom(2.3);
		Tom ob3 = new Tom("ooops", 3.0, 4.0);
		
		System.out.println("ob1 area " + ob1.area() + " + ob1 style " +ob1.getStyle());
		System.out.println("ob2 area " + ob2.area() + " + ob2 style " +ob2.getStyle());
		System.out.println("ob3 area " + ob3.area() + " + ob3 style " + ob3.getStyle());
		
		
	}
}
