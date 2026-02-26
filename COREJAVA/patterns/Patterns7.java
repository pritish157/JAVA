package patterns;

public class Patterns7 {
public static void main(String[] args) {
	for(int r = 1 ; r<=5 ; r++) {
		for(int d =5;d>=r;d--) {
			System.out.print("");
		}
		for(int s=1;s<=r;s++) {
			System.out.print(" * ");
		}
//		for(int p=5;p>=r;p--) {
//			System.out.print("-");
//		}
		System.out.println();
	}
}
}
