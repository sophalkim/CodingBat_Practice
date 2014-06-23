
public class FrontBack {

	public static String frontBack(String str) {
		int len = str.length();
		if (len < 2) {
			return str;
		}
		return str.substring(len - 1, len) + str.substring(1, len - 1) + str.substring(0, 1);
	}
	
	
	public static void main(String[] args) {
		String str = "code";
		System.out.println(frontBack(str));
	}
}
