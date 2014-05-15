
public class MinCat {

	public static String minCat(String a, String b) {
		int lenA = a.length();
		int lenB = b.length();
		if (lenA <= 0 || lenB <= 0) {
			return "";
		}
		if (lenA > lenB) {
			return a.substring(lenA - lenB, lenA) + b;
		}
		if (lenB > lenA) {
			return a + b.substring(lenB - lenA);
		}
		return a + b;
	}
	
	
	public static void main(String[] args) {
		String a = "Hello";
		String b = "Hi";
		System.out.println(minCat(a, b));
	}
}
