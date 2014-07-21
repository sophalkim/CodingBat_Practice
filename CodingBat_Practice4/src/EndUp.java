
public class EndUp {

	public static String endUp(String str) {
		int len = str.length();
		if (len >= 4) {
			return str.substring(0, len - 3) + str.substring(len - 3, len).toUpperCase();
		}
		return str.toUpperCase();
	}
	
	
	public static void main(String[] args) {
		String str = "hi there";
		System.out.println(endUp(str));
	}
}
