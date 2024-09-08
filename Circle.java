package task6.GuviTask6;

public class Circle {
	
	private double radius;
	
	 public Circle()
	 {
		 this.radius=6.50;
	 }
	 public Circle(double radius) {
		this.radius=radius; 
	 }

	 public double circum() {
		 double x=2*Math.PI*radius;
		 return x;
	 }
	public static void main(String[] args) {

Circle C=new Circle();
System.out.println("Circumferrence for given radius  "+C.circum());

Circle C1=new Circle(11.0);
System.out.println("Circumferrence for given radius  "+C1.circum());
		

	}

}
