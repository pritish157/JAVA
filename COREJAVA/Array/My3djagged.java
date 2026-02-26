package Array;

import java.util.Scanner;

public class My3djagged {

	public static void main(String[] args) {
	int[][][] a =new int[2][][];
	a[0]=new int[3][3];
	a[1]=new int[4][2];
	Scanner scanner = new Scanner(System.in);
	for (int b = 0; b < a.length; b++) {
		for (int r = 0; r < a[b].length; r++) {
			for (int c = 0; c < a[b][r].length; c++) {
				System.out.println("enter data for a["+b+"]"+"["+r+"["+c+"]: ");
				a[b][r][c]=scanner.nextInt();
			}
			
		}
		
	}
	for (int b = 0; b < a.length; b++) {
		for (int r = 0; r < a[b].length; r++) {
			for (int c = 0; c < a[b][r].length; c++) {
				System.out.print(a[b][r][c]+" ");}
			System.out.println();}
		System.out.println();}
	scanner.close();
	}
	

}
