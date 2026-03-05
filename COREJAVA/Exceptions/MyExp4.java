package Exceptions;

import java.util.Scanner;

public class MyExp4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("connection establlished.");
		try {
			System.out.println("enter the size of an array: ");
			int n = sc.nextInt();
			int[] arr = new int[n];
			System.out.println("length of the array: " + arr.length);
		} catch (Exception e) {
			System.out.println("array index cant be negative.");
		}

		System.out.println("connection terminated..");
	}

}
