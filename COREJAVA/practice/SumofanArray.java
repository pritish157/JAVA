package practice;

import java.util.Scanner;

public class SumofanArray {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int sum =0;
	System.out.println("enter the length of the array:");
	int i = scanner.nextInt();
	int[] ar = new int[i];
	for (int j = 0; j < ar.length; j++) {
		System.out.println("enter the "
				+j+ "th number");
		ar[j] = scanner.nextInt();
		sum = sum + ar[j];
		
	}
	System.out.println("sum is:"+sum);
	scanner.close();
}
}
