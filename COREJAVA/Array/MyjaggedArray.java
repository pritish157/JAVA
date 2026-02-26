package Array;


import java.util.Scanner;

public class MyjaggedArray {
public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	int[][]a=new int[2][];
	a[0]=new int[2];
	a[1]=new int[3];
	
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			System.out.println("enter the data for a["+i+"]"+"a["+j+"]:");
			a[i][j]=scanner.nextInt();
			
		}
	}
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			System.out.print(+a[i][j]+" ");
} 
		System.out.println();
		}

	scanner.close();}
}
