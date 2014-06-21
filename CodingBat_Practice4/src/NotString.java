
public class NotString {

	public static String notString(String str) {
		int len = str.length();
		if (len < 3) {
			return "not " + str;
		}
		if (str.substring(0, 3).equals("not")) {
			return str;
		}
		return "not " + str;
	}
	
	
	public static void main(String[] args) {
		String str = "candy";
		System.out.println(notString(str));
	}
}
