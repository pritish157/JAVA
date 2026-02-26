package String;

public class Myimmutable {

	public static void main(String[] args) {
		String s1 = "rOOMAN";
		System.out.println(s1);
		System.out.println(s1.concat(" Technology"));
		System.out.println(s1);
		StringBuffer s2 = new StringBuffer(s1);
		System.out.println(s2);
		s2.append("technology");
		s1=s2.toString();
		System.out.println(s2);
		System.out.println(s1);

	}

}
