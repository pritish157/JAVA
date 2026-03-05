package Inheritance;

class Animal {

	protected Animal getAnimal() {
		System.out.println("Parent returning Animal");
		return new Animal();
	}
}

class Tiger extends Animal {

	@Override
	public Tiger getAnimal() { // Covariant return type
		System.out.println("Child returning Tiger");
		return new Tiger();
	}
}

class Lion extends Animal {

	@Override
	protected Lion getAnimal() { // Covariant return type
		System.out.println("Child returning Lion");
		return new Lion();
	}
}

public class MyZoo {

	public static void main(String[] args) {

		Animal a1 = new Tiger();
		a1.getAnimal();

		System.out.println();

		Animal a2 = new Lion();
		a2.getAnimal();
	}
}