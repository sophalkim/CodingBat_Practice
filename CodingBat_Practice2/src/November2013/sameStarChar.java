package November2013;

public class sameStarChar {
	
	public static boolean sameStarChar(String str) {
		int len = str.length() - 1;
		for (int i = 1; i < len; i++) {
			if (str.charAt(i) == '*') { 
				if (str.charAt(i - 1) == str.charAt(i + 1)) {
				} else {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		String str = "xy*zzz";
		System.out.println(sameStarChar(str));
	}
}
