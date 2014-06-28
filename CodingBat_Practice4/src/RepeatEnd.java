
public class RepeatEnd {

	public static String repeatEnd(String str, int n) {
		int len = str.length();
		String x = "";
		for (int i = 0; i < n; i++) {
			x+= str.substring(len - n, len);
		}
		return x;	
	}
	
	
	public static void main(String[] args) {
		String str = "Hello";
		int n = 3;
		System.out.println(repeatEnd(str, n));
	}
}
