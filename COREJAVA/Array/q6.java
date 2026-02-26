//in a school there are 2 class rooms each class room has 4 students help the teacher to assign the marks of the each student


package Array;

import java.util.Scanner;

public class q6 {
public static void main(String[] args) {
	int [][] ar = new int[2][4];
	Scanner scanner = new Scanner(System.in);
	
	
	for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 4; j++) {
			
		System.out.println("data for ar["+i+"]"+"["+j+"]:");
		ar[i][j]=scanner.nextInt();	
		}
	}
	for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 4; j++) {
			
		System.out.println("data of ar["+i+"]"+"["+j+"]:"+ar[i][j]);}}
}
}
