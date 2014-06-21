
public class MissingChar {

	public static String missingChar(String str, int n) {
		String x = "";
		for (int i = 0; i < str.length(); i++) {
			if (i != n) {
				x += str.charAt(i);
			}
		}
		return x;
	}
	
	
	public static void main(String[] args) {
		String str = "kitten";
		int n = 1;
		System.out.println(missingChar(str, n));
	}
}
