
public class ConCat {

	public static String conCat(String a, String b) {
		int lenA = a.length();
		int lenB = b.length();
		if (lenA <= 0) {
			return b;
		}
		if (lenB <= 0) {
			return a;
		}
		if (a.endsWith(b.substring(0, 1))) {
			return a + b.substring(1);
		}
		return a + b;
	}
	
	
	public static void main(String[] args) {
		String a = "abc";
		String b = "";
		System.out.println(conCat(a, b));
	}
}
