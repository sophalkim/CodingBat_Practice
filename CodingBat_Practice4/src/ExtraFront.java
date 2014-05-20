
public class ExtraFront {

	public static String extraFront(String str) {
		int len = str.length();
		if (len < 2) {
			return str + str + str;
		}
		String x = str.substring(0, 2);
		return x + x + x;
	}
	
	
	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(extraFront(str));
	}
}
