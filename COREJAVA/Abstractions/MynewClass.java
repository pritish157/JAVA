package Abstractions;

abstract class Myabstract {

	static int a = 10;
	static {
		System.out.println("inside static block.");
	}

	public static void m1() {
		System.out.println("inside static method.");
	}

	int x = 100;// instance var.
	{
		System.out.println("inside instance block.");
	}

	public Myabstract() {
		System.out.println("inside constructor");
	}

	public void m2() {
		System.out.println("inside instance method.");
	}

	public abstract void m3();
}

public class MynewClass {

	public static void main(String[] args) {

	}

}
