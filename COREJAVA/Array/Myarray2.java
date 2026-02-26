package Array;

import java.util.Scanner;

public class Myarray2 {
public static void main(String[] args) {
    int[]	a=new int[5];
    Scanner scan = new Scanner(System.in);
   
    for(int i =0;i<a.length;i++) {
    	
    	System.out.println("ENTER THE VALUE FOR a["+i+"]:");
    	a[i]=scan.nextInt();
    }
    for (int i = 0; i < a.length; i++) {
    	System.out.println(a[i]);
	}
    scan.close();
}
}
