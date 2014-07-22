
public class EveryNth {

	public static String EveryNth(String str, int n) {
		int len = str.length();
		String x = "";
		for (int i = 0; i < len; i += n) {
			x += str.charAt(i);
		}
		return x;
	}
	
	
	public static void main(String[] args) {
		String str = "Miracle";
		int n = 2;
		System.out.println(EveryNth(str, n));
	}
}
