package Inheritance;

class Mypareent {

	/*
	 * public int add() {
	 * 
	 * int a = 10, b = 20; System.out.println("a+b=" + (a + b)); return (a + b);}
	 */

	public Animal add() {
		Animal a = new Animal();
		return a;

	}

}

class Mychiild extends Mypareent {
	/*
	 * @Override public int add() {
	 * 
	 * int a = 10, b = 20; System.out.println("a+b=" + (a + b)); return (a + b); }
	 */

	@Override
	public Lion add() {
//		Animal a1 = new Animal();
		Lion l = new Lion();
		return l;
	}
	/*
	 * @Override public Tiger add() {
	 * 
	 * Tiger t = new Tiger(); return t;}
	 */

}

class Aniimal {

}

class Liion extends Animal {

}

class Tiiger extends Animal {

}

public class MyRules {

	public static void main(String[] args) {

		Mychiild m = new Mychiild();
		m.add();

	}

}

//Rules of
//method overiding
//1-child class overiden method s return type shuld be same as the parent method return type...as per the primitive data type is considered 