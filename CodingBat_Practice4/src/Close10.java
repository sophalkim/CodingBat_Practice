
public class Close10 {

	public static int close10(int a, int b) {
		int x = Math.abs(10 - a);
		int y = Math.abs(10 - b);
		if (x == y) {
			return 0;
		}
		if (x < y) {
			return a;
		} else {
			return b;
		}
	}
	
	
	public static void main(String[] args) {
		int a = 8;
		int b = 13;
		System.out.println(close10(a, b));
	}
}
