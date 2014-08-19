
public class SameStarChar {

	public static boolean sameStarChar(String str) {
		int len = str.length();
		if (len <= 2) {
			return true;
		}
		for (int i = 1; i < len - 1; i++) {
			if (str.charAt(i) == '*') {
				if (str.charAt(i - 1) == str.charAt(i + 1)) {
					return true;
				} else {
					return false;
				}
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		String str = "*xa*az";
		System.out.println(sameStarChar(str));
	}
}
