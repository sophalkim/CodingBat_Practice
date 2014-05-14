
public class XyzThere {

	public static boolean xyzThere(String str) {
		int len = str.length();
		if (len < 3) {
			return false;
		}
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i +3).equals("xyz")) {
				if (i - 1 >= 0 && str.substring(i - 1, i).equals(".")) {
					continue;
				} else {
					return true;
				}
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		String str = "xyz.abc";
		System.out.println(xyzThere(str));
	}
}
