package Inheritance;
class Dog{
	String name;
	int cost;
	
	
	
	
	public Dog(String name) {
//		super();
		this.name = name;
		
	}
	public Dog(int cost) {
//		super();
		this.cost = cost;
	}
	public Dog(String name, int cost) {
//		super();
		this.name = name;
		this.cost = cost;
	}
	public Dog() {
		
//		super();
		System.out.println("dog object is created");// TODO Auto-generated constructor stub
	}
	public void bark() {
		System.out.println("Dog is barking");
	}
}
class Puppy extends Dog{
public Puppy() 
{
	super();
	System.out.println("pupppy object is created");// TODO Auto-generated constructor stub
}
}


public class Kennel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Puppy p = new Puppy();
p.bark();
	}

}
