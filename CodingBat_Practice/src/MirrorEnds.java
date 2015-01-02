
public class MirrorEnds {

	public static String mirrorEnds(String str) {
		int len = str.length();
		String x = "";
		String y = "";
		String result = "";
		for (int i = 0; i < len; i++) {
			x = str.substring(0, i);
			for (int j = len; j > len - i - 1; j--) {
				y = y + str.substring(len - j, len - j + 1);
			}
			if (x.equals(y)) {
				result = x;
			} else {
				return result;
			}
			y = "";
		}
		return x;
	}
	
	public static void main(String[] args) {
		String str = "abXYZba";
		System.out.println(mirrorEnds(str));
	}
}
