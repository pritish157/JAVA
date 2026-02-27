package Statickeyword;

public class MyStatic1 {
	static int a =1000;
	
	static{
		System.out.println(a);
		System.out.println("hello world");
		a=101;
		System.out.println(a);
	}
	public static void main(String[] args) {
		System.out.println("hello main method");
	}

}
