package Practice3;

public class NotReplace {

	public static String notReplace(String str) {
		int len = str.length();
		String s = "is";
		String x = "";
		String n = " not";
		for (int i = 0; i < str.length(); i++) {
			if (i + 1 < len && str.substring(i, i + 2).equals(s)) {
				if (i + 2 < len && Character.isLetter(str.charAt(i + 2))) {
					x += str.substring(i, i + 1);
					continue;
				}
				if (i == 0) {
					x = x + s + n;
					i++;
					continue;
				}
				if (!Character.isLetter(str.charAt(i - 1))) {
					x = x + s + n;
					i++;
					continue;
				}
			}
			x += str.substring(i, i + 1);
		}
		return x;
	}
	
	
	public static void main(String[] args) {
		String str = "isis";
		System.out.println(notReplace(str));
	}
}
