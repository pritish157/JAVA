package Polymorphism;

class MyStatic {
    // Static variables
    static int x;
    static int y;

    // Static block
    static {
        System.out.println("Inside static block");
        x = 10;
        y = 20;
    }

    // Static method
    public static void staticMethod() {
        System.out.println("Inside static method");
        System.out.println("Accessing static variables");
        System.out.println(x);
        System.out.println(y);
    }

    // Instance variables
    int a;
    int b;

    // Instance block
    {
        System.out.println("Inside instance block");
        a = 100;
        b = 200;
    }

    

    // Instance method
    public void instanceMethod() {
        System.out.println("Inside instance method");
        
    }
 // Constructor
    public MyStatic() {
        System.out.println("Inside constructor");
        System.out.println("Accessing instance variables: " + a + " " + b);
    }
}

public class MyAlpha {

    public static void main(String[] args) {

        MyStatic.staticMethod();   // static call

        MyStatic m = new MyStatic(); // object creation

        m.instanceMethod();        // instance call
    }
}