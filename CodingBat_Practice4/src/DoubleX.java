
public class DoubleX {

	public static boolean doubleX(String str) {
		int len = str.length();
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == 'x') {
				if (i + 1 == len) {
					return false;
				}
				if (str.charAt(i + 1) == 'x') {
					return true;
				} else {
					return false;
				}
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		String str = "axaxax";
		System.out.println(doubleX(str));
	}
}
