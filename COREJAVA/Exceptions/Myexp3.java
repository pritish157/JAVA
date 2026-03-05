package Exceptions;

import java.util.Scanner;

public class Myexp3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("connection establlished.");

		int[] arr = new int[3];

		arr[0] = 10;

		arr[1] = 20;
		arr[2] = 30;
		System.out.println("enter the index you want to access: ");
		int index = sc.nextInt();
		System.out.println(arr[index]);

		System.out.println("connection terminated..");
	}

}
