package Inheritance;
class Grandparents{
	public void read() {
		System.out.println("grand parents are reading...");
	}
}
class parent extends Grandparents {
	public void write() {
		System.out.println("writing");
	}
}
class child extends parent{
	
}
public class Multilevel {
 public static void main(String[] args) {
	child m = new child();
	m.write();
	m.read();
	
}
}
