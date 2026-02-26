package assignment;

public class Car {
String brand;
double cost;
public static void main(String[] args) {
	Car c = new Car();
	c.brand ="BMW";
	c.cost=2500000.66;
	Car b ;
	b = c;
	System.out.println(c.brand);
	System.out.println(c.cost);
	System.out.println(b.brand);
	System.out.println(b.cost);
	
	b.brand="nano";
	b.cost = 1234567;
	
	System.out.println(c.brand);
	System.out.println(c.cost);
	System.out.println(b.brand);
	System.out.println(b.cost);
	
}
}
