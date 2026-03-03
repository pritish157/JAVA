package MyInterface;

import java.util.Scanner;

interface Calculator {

	public abstract void add();

	public abstract void sub();
}

class Calci implements Calculator {
	@Override
	public void add() {

		int a = 100, b = 200;
		System.out.println("add:" + (a + b));
	}

	@Override
	public void sub() {

		int a = 200, b = 100;
		System.out.println("sub:" + (a - b));
	}

}

class SciCalci implements Calculator {
	Scanner s = new Scanner(System.in);

	@Override
	public void add() {
		System.out.println("enter a :");
		int a = s.nextInt();
		System.out.println("enter b :");
		int b = s.nextInt();
		System.out.println("sum:" + (a + b));
	}

	@Override
	public void sub() {
		int a = 1000000000, b = 20000000;
		System.out.println("diff:" + (a - b));
	}
}

class MathCalci implements Calculator {

	@Override
	public void add() {

		java.util.Scanner s = new java.util.Scanner(System.in);

		System.out.println("Enter value of a (must be > 100):");
		int a = s.nextInt();

		if (a > 100) {
			System.out.println("Enter value of b:");
			int b = s.nextInt();
			System.out.println("Math Add: " + (a + b));
		} else {
			System.out.println("Error: 'a' must be greater than 100");
		}
	}

	@Override
	public void sub() {
		int a = 100000000, b = 300000;
		System.out.println("Math Sub: " + (a - b));
	}

}

public class MyOperation {

	public static void main(String[] args) {

		Calci c1 = new Calci();
		SciCalci c2 = new SciCalci();
		MathCalci c3 = new MathCalci();
		c1.add();
		c1.sub();
		c2.add();
		c2.sub();
		c3.add();
		c3.sub();

	}

}
