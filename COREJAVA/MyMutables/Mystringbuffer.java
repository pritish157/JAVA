package MyMutables;

public class Mystringbuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("java");
		System.out.println(sb);
		sb.append(" javascript");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append(" jamesgoshling");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.capacity());
	}

}
