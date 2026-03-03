package Final_Keyword;

//parent class
//final class can't be inherited
//final class MyFinal {
class MyFinal {
	public void nonFinal() {

		System.out.println("inside non final methoddd...");
	}

	public final void m1() {
		System.out.println("m1() is a final method can't be overridden");
	}
}

//child 1
class Mychild extends MyFinal {

	@Override
	public void nonFinal() {

		System.out.println("Overiding nonfinal in child class");
	}

	// @Override
	// public void m1() // final method cant be overridden......{}

	// public abstract final void m2();final cant be overridden.

}

//main claass
public class MyExecution {

	public static void main(String[] args) {
//		Mychild c = new Mychild();
//
//		c.nonFinal();
//		c.m1();//instanciation of final method is possible but it cant be overridden
		// final double A = 100.01;//final var. are constants.its avalue cant be re
		// assigneed..variable name of a
		// constant
		// should be
		// in capital...

//		System.out.println(A);
//
//		System.out.println(Math.PI);// classname.var_name

	}

}
