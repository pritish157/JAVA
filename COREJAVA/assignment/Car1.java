//pass by reference 
//java does not support pass by reference
package assignment;

public class Car1 {
String brand;
double cost;

public void exchange(Car1 a) {
	a.brand="maruti";
	a.cost=250000;
}

public static void main(String[] args) {
	Car1 c = new Car1();
	c.brand="Audi";
	c.cost=1200000;
	System.out.println(c.brand);
	System.out.println(c.cost);
	c.exchange(c);
	System.out.println(c.brand);
	System.out.println(c.cost);
}
}
