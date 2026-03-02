package Abstractions;

abstract class Calci {
	public void add() {
		int a = 20;
		int b = 30;
		System.out.println("a+b= " + (a + b));
	}
}

public class MyLab {

	public static void main(String[] args) {

		Calci c = new Calci();
		c.add();
	}

}
