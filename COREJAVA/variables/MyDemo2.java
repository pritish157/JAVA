package variables;

public class MyDemo2 {
public void m1() {
	//local variables
	//local variables need to be initialized where as instantaneous var does not require
	
//	int a ;
//	float b ;
//	boolean c ;
//	String name ;
	int a=10 ;
	float b = 10.89f;
	boolean c =true;
	String name ="pritish";
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(name);
}
public static void main(String[] args) {
	MyDemo2 d = new  MyDemo2();
	d.m1();
}
}
