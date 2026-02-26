//a teacher of a class want to store names of the students kindly take the inputs and help her 


package Array;

import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("enter the number of students :");
		 int j = scanner.nextInt();
		 String[] arr= new String [j];
		 
		 for (int i = 0; i < arr.length; i++) {
			
				System.out.println("enter the name of the student("+i+")");
				arr[i]=scanner.next();
			}
		 for (int i = 0; i < arr.length; i++) {
			System.out.println("names of the student"+i+":"+arr[i]);
		}
		 scanner.close();
		}
		
		
	}

