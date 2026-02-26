package practice;

import java.util.Scanner;

public class ReverseTheArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		
		int[] ar = new int[i];
		int[] rev_ar = new int[i];
		for (int j = 0; j < ar.length; j++) {
			System.out.println("enter the "
					+ j+"th element");
		ar[j]=scanner.nextInt();
		
		for (int j2 = rev_ar.length; j2 > 0; j2--) {
			rev_ar[j]=ar[j2];
		}
		
		}
		for (int j = 0; j < rev_ar.length; j++) {
			System.out.println(rev_ar[j]);
		}

	}

}
