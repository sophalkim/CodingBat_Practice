
public class Front3 {

	public static String front3(String str) {
		int len = str.length();
		if (len < 3) {
			return str + str + str;
		}
		String x = str.substring(0, 3);
		return x + x + x;
	}
	
	
	public static void main(String[] args) {
		String str = "Java";
		System.out.println(front3(str));
	}
}
