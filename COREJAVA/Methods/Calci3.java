package Methods;
//takes input returns output
public class Calci3 {
public int add(int x,int y) {
	int sum = x+y;
	return sum;
	
	
}
public static void main(String[] args) {
	Calci3 c = new Calci3();
 int result = c.add(15,60);
 System.out.println("the sum is :"+result);
}
}
