
public class PrefixAgain {

	public static boolean prefixAgain(String str, int n) {
		String x = str.substring(0, n);
		for (int i = n; i < str.length() - n + 1; i++) {
			if (str.substring(i, i + n).equals(x)) {
				return true;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		String str = "abXYabc";
		int n = 1;
		System.out.println(prefixAgain(str, n));
	}
}
