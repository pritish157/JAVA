package Methods;
//takes no input gives output

public class Calci1 {
public int add() {
	int a = 100,b=200;
	int sum = a+b;
	return sum;
	
}
public static void main(String[] args) {
	Calci1 c = new Calci1();
	int i = c.add(); //ctrl+1+enter -->to know whether it is returning or not 
	System.out.println("result is :"+i);
}
}
