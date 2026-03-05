package MyInterface;

interface Bird {
	void fly();

	void eat();
}

abstract class Eagle implements Bird {

	@Override
	public void fly() {
		System.out.println("flies at greater1 heihghghght....");

	}

	@Override
	public abstract void eat();

}

class Goldeneagle extends Eagle {
	@Override
	public void eat() {
		System.out.println("eats fish.....");
	}
}

class SerpentEagle extends Eagle {
	@Override
	public void eat() {
		System.out.println("eats snakes.....");
	}
}

public class MyEagle {

	public static void main(String[] args) {

	}

}
