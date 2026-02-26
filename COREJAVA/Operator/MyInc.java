package Operator;

public class MyInc {
public static void main(String[] args) {
	int a = 20;
	int b = 22;
	int m = --a + --b + a++ + b++ ;
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(m);
	
	}
}
