
public class XyzMiddle {

	public static boolean xyzMiddle(String str) {
		int len = str.length();
		int mid = len / 2;
		if (len < 3) {
			return false;
		}
		String lowerCase = str.toLowerCase();
		for (int i = mid - 1; i < mid + 1; i++) {
			if (i + 3 < len && lowerCase.substring(i, i + 3).equals("xyz")) {
				return true;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		String str = "AxyzBB";
		System.out.println(xyzMiddle(str));
	}
}
