
public class Max1020 {

	public static int max1020(int a, int b) {
		boolean x = (a >= 10 && a <= 20);
		boolean y = (b >= 10 && b <= 20);
		if (!x && !y) {
			return 0;
		}
		if (!x) {
			return b;
		}
		if (!y) {
			return a;
		}
		return Math.max(a, b);
	}
	
	
	public static void main(String[] args) {
		int a = 11;
		int b = 19;
		System.out.println(max1020(a, b));
	}
}
