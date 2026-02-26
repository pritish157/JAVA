package Inheritance;


class Myparent {
	public void write() {
		System.out.println("writing");
	}
}
class Mychild extends Myparent{
	
}
public class SingleLevel {
 public static void main(String[] args) {
	Mychild m = new Mychild();
	m.write();
	
}
}
