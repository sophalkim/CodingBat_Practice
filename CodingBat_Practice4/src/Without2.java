
public class Without2 {

	public static String without2(String str) {
		int len = str.length();
		if (len < 2) {
			return str;
		}
		if (str.substring(0, 2).equals(str.substring(len - 2, len))) {
			return str.substring(2);
		}
		return str;
	}
	
	
	public static void main(String[] args) {
		String str = "He";
		System.out.println(without2(str));
	}
}
