//emplyer wants to store employee's salary kindly help him to do so
package Array;

import java.util.Scanner;

public class q5 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter total number of employees :");
	int i = scanner.nextInt();
	System.out.println(" total number of employees is :"+i);
	double[] s = new double[i];
	for (int j = 0; j < s.length; j++) {
	System.out.println("enter the salary for employee "+j+":");
	s[j]=	scanner.nextDouble();
		
	}
	for (int k = 0; k < s.length; k++) {
		System.out.println("wnter the id number of the employee:");
		int id = scanner.nextInt();
		System.out.println("salary of the employee "+id+":");
	}
}
}
