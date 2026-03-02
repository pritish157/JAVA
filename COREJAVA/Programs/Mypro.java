package Programs;

class myPrints {
	public static void prints() {
		for (int j = 65; j <= 90; j++) {

			System.out.println((char) j);
		}

		for (int i = 65; i <= 90; i++) {

			System.out.println((char) (i + 32));

		}
	}
}

public class Mypro {

	public static void main(String[] args) {

		myPrints.prints();

	}

}
