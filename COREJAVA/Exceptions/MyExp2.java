package Exceptions;

import java.util.Scanner;

public class MyExp2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("connectioon established.");
		System.out.println("enter int a ");
		int a = sc.nextInt();
		System.out.println("enter int b ");
		int b = sc.nextInt();
		int c = a / b;
		System.out.println("result of a/b is " + c);
		System.out.println("connection terminatd.");
	}
}
