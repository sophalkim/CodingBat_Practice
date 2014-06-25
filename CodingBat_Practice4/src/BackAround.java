
public class BackAround {

	public static String backAround(String str) {
		int len = str.length();
		if (len < 1) {
			return "";
		}
		String x = str.substring(len - 1, len);
		return x + str + x;
	}
	
	
	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(backAround(str));
	}
}
