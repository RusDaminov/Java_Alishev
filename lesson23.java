public class lesson23 {
	public static void main(String[] args) {
//		String string1 = "Hello";
//		String string2 = " my";
//		String string3 = " friend";
//		String stringAll = string1+string2+string3;
//		System.out.println(stringAll);
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" my").append(" friend");
		System.out.println(sb.toString());
	}
}
