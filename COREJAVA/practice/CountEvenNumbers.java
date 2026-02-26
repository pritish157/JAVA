package practice;

import java.util.Scanner;

public class CountEvenNumbers {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the length of the array:");
	int n = scanner.nextInt();
	int [] ar = new int[n];
	
	int counter = 0;
	
	for (int i = 0; i < ar.length; i++) {
		System.out.println(i+"th element :");
		ar[i] = scanner.nextInt();
	}
	for(int a:ar) {
		if(a%2==0) {
			counter = counter +1 ;
//			System.out.println("even numbers are:"+a);
			
			
		}
	
}
	System.out.println("Number of Even no.s are :"+counter);
	scanner.close();
}
}