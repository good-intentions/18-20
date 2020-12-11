package simeon;

public class Triangle extends GeometricObject {
	 private double side1 = 1.0 , side2 = 1.0 , side3 = 1.0;
	 double p;
	 Triangle(){
		 this.p = (side1 + side2 + side3)/2;
	 }
	 Triangle(double x, double y, double z){
		 this.side1 = x;
		 this.side2 = y;
		 this.side3 = z;
		 this.p = (side1 + side2 + side3)/2;
		 
		 if(x+y<z || x+z<y || y+z<x) this.exists = false;
		 
	 }
	 
	 public double getArea() {
		 return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
	 }
	 public double getPerimeter() {
		 return this.p*2;
	 }
	 public void printTriangle() {
		 System.out.println( "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3);
	 }

}
