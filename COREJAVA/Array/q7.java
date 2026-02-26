//in a building there are 3 floors each floor has 3 rooms.

package Array;

import java.util.Scanner;

public class q7 {
public static void main(String[] args) {
	int[][] ar = new int[3][3];
	Scanner scanner = new Scanner(System.in);
	
	for (int i = 0; i < ar.length; i++) {
		for (int j = 0; j < ar[i].length; j++) {
			System.out.println("enter the data of floor "+i+" room "+j+":");
			ar[i][j]=scanner.nextInt();
		}
	}
	for (int i = 0; i < ar.length; i++) {
		for (int j = 0; j < ar[i].length; j++) {
			System.out.println(" data of floor "+i+"room"+j+ar[i][j]);
}
}
	scanner.close();
	}}
