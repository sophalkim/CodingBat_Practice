package November2013;

public class starOut {
	
	public static String starOut(String str) {
		String x = "";
		int len = str.length();
		for (int i = 0; i < len; i++) {
			char y = str.charAt(i);
			if (y!='*') {
				if (i > 0 && str.charAt(i - 1) == '*') {
					continue;
				}
				if (i + 1 < len && str.charAt(i + 1) == '*') {
					continue;
				}
				x = x + y;
			}
		}
		return x;
	}
	
	public static void main(String[] args) {
		String str = "ab*cd";
		System.out.println(starOut(str));
	}
}
