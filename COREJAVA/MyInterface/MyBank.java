package MyInterface;

interface ATM {
	public abstract void withdraw();

	public abstract void deposit();

	public static final int a = 100;
}

class a {
	public void m1() {
	}

	{

	}
}

//
//// public a() {constructor can't be created inside a interface as we cant
/// create the object opf an interface . hence we cant acces the consrtrt....
//// 
/// }
//}
//
//interface b extends a {
//
//}
class Myimplements extends a implements ATM {

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub

	}

}

class SBI implements ATM {
	@Override
	public void withdraw() {
		System.out.println("WITHDRAWING FROM sbi...");
	}

	@Override
	public void deposit() {
		System.out.println("depositing in sbi...");
	}

	public void specialRoi() {
		System.out.println("8.5%");
	}
}

class Canara implements ATM {

	@Override
	public void withdraw() {
		System.out.println("WITHDRAWING FROM Canara...");
	}

	@Override
	public void deposit() {
		System.out.println("depositing in Canara...");
	}
}

class Axis implements ATM {

	@Override
	public void withdraw() {
		System.out.println("WITHDRAWING FROM Axis...");
	}

	@Override
	public void deposit() {
		System.out.println("depositing in Axis...");
	}
}

class PlutoneMall {
	public static void getinstalled(ATM a) {
		a.withdraw();
		a.deposit();

	}
}

public class MyBank {
	public static void main(String[] args) {

		ATM sb = new SBI();
		ATM c = new Canara();
		ATM aa = new Axis();

		PlutoneMall.getinstalled(sb);
		((SBI) sb).specialRoi();
		PlutoneMall.getinstalled(c);
		PlutoneMall.getinstalled(aa);
	}
}
