//in a school there are 3 class rooms 1st class room has 4 students, 2nd class room has 2 students,3rd class room has 3 students

package Array;

import java.util.Scanner;

public class q9 {
public static void main(String[] args) {
int[][]	a=new int[3][];
a[0]=new int[4];
a[1]=new int[2];
a[2]=new int[3];

Scanner scanner = new Scanner(System.in);

for (int i = 0; i < a.length; i++) {
	for (int j = 0; j < a[i].length; j++) {
		System.out.println("enter the mark for student of classroom["+i+"]"+"student["+j+"]:");
		a[i][j]=scanner.nextInt();
	}}
for (int i = 0; i < a.length; i++) {
	for (int j = 0; j < a[i].length; j++) {
		System.out.print(+a[i][j]+" ");
} 
	System.out.println();
	}
	scanner.close();
}
}
