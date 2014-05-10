package November2013;

public class prefixAgain {

	public static String str = "ab";
	static int n = 1;
	
	public static boolean prefixAgain(String str, int n) {
		String x = str.substring(0, n);
		System.out.println(x);
		for (int i = n - 1; i < str.length() - n; i++) {
			if (str.substring(i, i + n + 1).equals(x)) {
				System.out.println(str.substring(i, i + n + 1));
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(prefixAgain(str, n));
	}

}
