
public class XyzMiddle {

	public static boolean xyzMiddle(String str) {
		int len = str.length();
		if (len < 3) {
			return false;
		}
		String lowerCase = str.toLowerCase();
		String x = "xyz";
		for (int i = 0; i < len - 2; i++) {
			if (lowerCase.substring(i, i + 3).equals(x)) {
				int front = i;
				int back = len - (i + 3);
				if (Math.abs(front - back) <= 1) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		String str = "AxyzBB";
		System.out.println(xyzMiddle(str));
	}
}
