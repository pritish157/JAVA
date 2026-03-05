package Exceptions;

import java.util.Scanner;

public class MyExp1 {

	public static void main(String[] args) {
		System.out.println("connections established...");
		Scanner s = new Scanner(System.in);
		System.out.println("enter your age:");
		int age = s.nextInt();
		System.out.println("age is " + age);

		System.out.println("connection terminated gracefully......");
	}

}
