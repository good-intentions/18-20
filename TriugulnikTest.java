package simeon;

public class TriugulnikTest {
	   public static void main(String[] args) {
    	   
		   Triangle t1 = new Triangle();
		   t1.setColor("cherven");
		   t1.printTriangle();
		   System.out.println(t1.getArea() + " " + t1.getPerimeter() 
		   + " " + t1.getColor() + " " + t1.isExists());
		   
		   
		   Triangle t2 = new Triangle(2,3,4);
		   t2.setColor("sin");
		   t2.printTriangle();
		   System.out.println(t2.getArea() + " " + t2.getPerimeter() 
		   + " " + t2.getColor() + " " + t2.isExists());
    	   
    	   
    	   
       }
}
