
public class DeFront {

	public static String deFront(String str) {
		int len = str.length();
		if (len <= 2) {
			if (len <= 1 && str.substring(0, 1).equals("a")) {
				return str;
			}
			if (len < 1) {
				return "";
			}
			if (str.substring(0, 1).equals("a") && str.substring(1, 2).equals("b")) {
				return str;
			}
			if (str.substring(0, 1).equals("a")) {
				return "a";
			}
			if (str.substring(1, 2).equals("b")) {
				return "b";
			}
			return "";
		}
		String x = str.substring(2, len);
		if (str.substring(0, 1).equals("a") && str.substring(1, 2).equals("b")) {
			return str;
		}
		if (str.substring(0, 1).equals("a")) {
			return "a" + x;
		}
		if (str.substring(1, 2).equals("b")) {
			return "b" + x;
		}
		return x;
	}
	
	
	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(deFront(str));
	}
}
