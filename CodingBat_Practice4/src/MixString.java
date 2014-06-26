
public class MixString {

	public static String mixString(String a, String b) {
		int lenA = a.length();
		int lenB = b.length();
		int max = Math.max(lenA, lenB);
		String x = "";
		for (int i = 0; i < max; i++) {
			if (i < lenA) {
				x += a.charAt(i);
			}
			if (i < lenB) {
				x += b.charAt(i);
			}
		}
		return x;
	}
	
	
	public static void main(String[] args) {
		String a = "xxxx";
		String b = "There";
		System.out.println(mixString(a, b));
	}
}
