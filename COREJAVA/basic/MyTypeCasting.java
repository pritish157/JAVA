package basic;
public class MyTypeCasting {

	public static void main(String[] args) {
		//implicit type casting--done by the compiler itself
//		byte a  = 45;
//		double b = a;
//		System.out.println(a);
//		System.out.println(b);
		//explicit type casting--done forcibly by the developer itself
		double a = 4578.5;
		byte b = (byte)a;
		System.out.println(a);
		System.out.println(b);
	}

}
