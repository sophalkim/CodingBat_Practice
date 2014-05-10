package November2013;

public class xyzMiddle {

	static String str = "xyzxyzAxyzBxyzxyz";
	
	public static boolean xyzMiddles(String str) {
		String x = "xyz";
		int front = 0;
		int back = 0;
		int len = str.length();
		int middle = str.length() / 2 - 2;
		if (len < 3) {
			return false;
		}
		if (len == 3) {
			return true;
		}
		boolean reverse = true;
		for (int i = 0; i < len; i++) {
			if (i + 3 < len && i >= middle && i <= middle + 2 && str.substring(i, i + 3).equals(x)) {
				i = i + 3;
				reverse = false;
			}
			if (reverse) {
				front++;
			} else {
				back++;
			}
		}
		System.out.println(front + ", " + back);
		System.out.println(str.substring(0, front));
		if (Math.abs(front - back) > 1) {
			return false;
		} else {
			return true;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(xyzMiddles(str));
	}
}
