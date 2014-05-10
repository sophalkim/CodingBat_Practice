package November2013;

public class zipZap {
	
	public static String zipZap(String str) {
		int len = str.length();
		if (len < 3) {
			return str;
		}
		String x = "";
		for (int i = 0; i < len; i ++) {
			char y = str.charAt(i);
			x = x + y;
			if (i < len - 2 && y == 'z' && str.charAt(i + 2) == 'p') {
				x = x + str.charAt(i + 2);
				i = i + 2;
			}
		}
		return x;
	}
	
	public static void main(String[] args) {
	
		String str = "zzzopzop";
		System.out.println(zipZap(str));
		
	}
}
