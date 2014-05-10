package November2013;

public class EqualisNot {
	
	public static boolean equalIsNot(String str) {
		int len = str.length();
		int m = len - 1;
		int n = len - 2;
		int x = 0;
		int y = 0;
		String a = "is";
		String b = "not";
		for (int i = 0; i < str.length(); i++) {
			if (i < m && str.substring(i, i + 2).equals(a)) {
				x++;
			}
			if (i < n && str.substring(i, i + 3).equals(b)) {
				y++;
			}
		}
		return x == y;
	}
	
	public static void main(String[] args) {
	
		String str = "noisxxnotyynotxisi";
		System.out.println(equalIsNot(str));
	}
}
