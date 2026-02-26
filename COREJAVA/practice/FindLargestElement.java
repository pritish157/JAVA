package practice;


import java.util.Scanner;

public class FindLargestElement {


	public static void main(String[] args) {
		System.out.println("enter the length of the array:");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		int[] ar = new int[i];
		
		
		
		for (int j = 0; j < ar.length; j++) {
			System.out.println("enter the "
					+ j+"th indx :");
			ar[j] = scanner.nextInt();}
			int largest = ar[0];
					
		for (int j = 0; j < ar.length; j++) {
			if(ar[j]>largest) {
				largest = ar[j];
			}
		}
System.out.println("largest is:"+largest);
	

scanner.close();
		
		
	
	}}
