
public class RepeatFront {

	public static String repeatFront(String str, int n) {
		String x = "";
		for (int i = n; i >= 0; i--) {
			x += str.substring(0, i);
		}
		return x;
	}
	
	
	public static void main(String[] args) {
		String str = "Chocolate";
		int n = 4;
		System.out.println(repeatFront(str, n));
	}
}
