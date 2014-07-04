
public class StringSplosion {

	public static String stringSplosion(String str) {
		int len = str.length();
		String x = "";
		for (int i = 1; i <= len; i++) {
			x += str.substring(0, i);
		}
		return x;
	}
	
	
	public static void main(String[] args) {
		String str = "ab";
		System.out.println(stringSplosion(str));
	}
}
