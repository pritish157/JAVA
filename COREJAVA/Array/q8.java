//in an apartmnt there are 3 floors each floor has 4 houses kindly help the milkman to drop the milk packets
package Array;

import java.util.Scanner;

public class q8 {
Package Array;
	public static void main(String[] args) {
	int[][] ar = new int[3][4];
	Scanner scanner = new Scanner(System.in);
	
	for (int i = 0; i < ar.length; i++) {
		for (int j = 0; j < ar[i].length; j++) {
			System.out.println("enter the data of floor "+i+" house no. "+j+":");
			ar[i][j]=scanner.nextInt();
		}
	}
	for (int i = 0; i < ar.length; i++) {
		for (int j = 0; j < ar[i].length; j++) {
			System.out.println(" data of floor " +i+ " house no. "+j+ ":"+ar[i][j]);
}		
}
	for (int i = 0; i < ar.length; i++) {
		for (int j = 0; j < ar[i].length; j++) {
			System.out.print(ar[i][j]+" ");
}
		System.out.println();}	

	scanner.close();
}}