package Programs;

class MyChar {
	public void mycharprnt() {
		String t = "";
		for (int i = 65; i <= 75; i++) {
			t = t + (char) i;

			System.out.println(t);
		}

		System.out.println(t);
	}
}

public class Mypro2 {
	public static void main(String[] args) {
		MyChar c = new MyChar();

		c.mycharprnt();
	}

}
