package practice;

class C1{
	private String color;
	private String name;
	
	public  C1() {
		System.out.println("inside default const.");
		this("Black","maruti");
	}
	public C1(String color,String name) {
		System.out.println("inside param. const.");
		this.color = color;
		this.name=name;
		//System.out.println(color + name);
		
		
	}
	public String getColor() {
		return color;
	}
//	public void setColor(String color) {
//		this.color = color;
//	}
	public String getName() {
		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
}

}
public class Car {

	public static void main(String[] args) {
		
C1 c1 = new C1();
System.out.println(c1.getColor()+c1.getName());
C1 c2 = new C1("Pink","Baleno");
System.out.println(c2.getColor()+c2.getName());

	}

}
