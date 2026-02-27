package Inheritance;

class Dog {
    String name;
    int cost;

    public Dog() {
        System.out.println("Dog object is created");
    }

    public Dog(String name, int cost) {
        this.name = name;
        this.cost = cost;
        System.out.println("Dog full constructor called");
    }

    public void bark() {
        System.out.println("Dog is barking");
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Cost: " + cost);
    }
}

class Puppy extends Dog {

    public Puppy() {
        super();
        System.out.println("Puppy object is created");
    }

    public Puppy(String name, int cost) {
        super(name, cost);
        System.out.println("Puppy parameterized constructor");
    }

    // Method Overriding
    @Override
    public void bark() {
        System.out.println("Puppy is barking softly");
    }
}

public class Kennel {

    public static void main(String[] args) {

        Puppy p = new Puppy("Tommy", 5000);

        p.bark();      // Overridden method will run
        p.display();   // Inherited method
    }
}