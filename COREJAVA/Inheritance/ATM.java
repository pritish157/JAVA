package Inheritance;

class RBI {
	public void Deposit() {

		System.out.println("money is deposited..");
	}

	public void withdraw() {
		System.out.println("money is withdrawn..");

	}

	public void checkBalance() {
		System.out.println("balance left is....");

	}
}

class SBIATM extends RBI {

}

class AxisATM extends RBI {

}

class CanaraATM extends RBI {

}

class Bank2 {
	public static void transaction(RBI r) {
		System.out.println("transaction is open...");
		r.Deposit();
		r.checkBalance();
		r.withdraw();
	}
}

public class ATM {

	public static void main(String[] args) {
		SBIATM s = new SBIATM();

		AxisATM a = new AxisATM();
		Bank2.transaction(a);
	}

}
