
public class Front22 {

	public static String front22(String str) {
		int len = str.length();
		if (len < 1) {
			return "";
		}
		if (len < 2) {
			return str + str + str;
		}
		String x = str.substring(0, 2);
		return x + str + x;
	}
	
	
	public static void main(String[] args) {
		String str = "kitten";
		System.out.println(front22(str));
	}
}
