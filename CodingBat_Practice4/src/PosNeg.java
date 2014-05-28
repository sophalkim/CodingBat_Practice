
public class PosNeg {

	public static boolean posNeg(int a, int b, boolean negative) {
		if (negative && a < 0 && b < 0) {
			return true;
		}
		if (a < 0 && b > 0 && !negative) {
			return true;
		}
		if (b < 0 && a > 0 && !negative) {
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		int a = 1;
		int b = -1;
		boolean negative = false;
		System.out.println(posNeg(a, b, negative));
	}
}
