package Inheritance;

class Bank1{
	public void roi() {
		System.out.println("6.5%");

	}
	//@Override-STATIC METHOD CANT BE OVERRIDDEn......
	public static void withdarw() {
		System.out.println("bank allows to withdraw");
		// TODO Auto-generated method stub

	}
}
class SBI extends Bank1{
	@Override
	public void roi() {
		// TODO Auto-generated method stub
		//super.roi();
		System.out.println("8.5%");
	}
}




public class Bank {

	public static void main(String[] args) {
		
		SBI s = new SBI();
		SBI.withdarw();
		s.roi();

	}

}
