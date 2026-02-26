//there are 2 buildings both building has 3 floors each floor has 4 cabins...

package Array;

import java.util.Scanner;

public class My3dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][][] a = new int[2][3][4];
//a[0][0][0]=10;
//a[1][0][0]=11;
Scanner scanner = new Scanner(System.in);
for (int b = 0; b < a.length; b++) {
	for (int r = 0; r < a[b].length; r++) {
		for (int c = 0; c < a[b][r].length; c++) {
			System.out.println("enter the data for a["+b+"]"+"a["+r+"]"+"a["+c+"]:");
			a[b][r][c]=scanner.nextInt();
		}
		
	}
	
}
for (int b = 0; b < a.length; b++) {
	for (int r = 0; r < a[b].length; r++) {
		for (int c = 0; c < a[b][r].length; c++) {
			System.out.print(a[b][r][c]+" ");
			
		}
		System.out.println();
		
	}
	System.out.println();
	
}




	
	}

}
