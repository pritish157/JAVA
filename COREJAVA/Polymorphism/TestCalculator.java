package Polymorphism;

class Calculator {

	void add(int a) {
		int c = 10 + a;
		System.out.println("Inside int add");
		System.out.println("Result: " + c);
	}

	void add(float b) {
		float d = 10.5f + b;
		System.out.println("Inside float add");
		System.out.println("Result: " + d);
	}

	void add(double m) {
		double n = 20.5 + m;
		System.out.println("Inside double add");
		System.out.println("Result: " + n);
	}

	void add(int a, int b) {
		int c = a + b;
		System.out.println("Inside int, int add");
		System.out.println("Result: " + c);
	}

	void add(int a, float b) {
		float d = a + b;
		System.out.println("Inside int, float add");
		System.out.println("Result: " + d);
	}

	void add(int a, int b, float c) {
		float g = a + b + c;
		System.out.println("Inside int, int, float add");
		System.out.println("Result: " + g);
	}
}

public class TestCalculator {
	public static void main(String[] args) {

		Calculator cal = new Calculator();

		cal.add(5);
		cal.add(5.5f);
		cal.add(10.5);
		cal.add(5, 10);
		cal.add(5, 2.5f);
		cal.add(5, 10, 2.5f);
	}
}
