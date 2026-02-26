package Methods;
//takes  no input gives no output

public class Calci {


		public void add() {
			int a = 100,b=200;
			int sum = a+b;
			System.out.println("result of method add()is :  "+ sum);
		
	}
		public static void main(String[] args) {
			Calci c = new Calci();
			c.add();
		}
}
