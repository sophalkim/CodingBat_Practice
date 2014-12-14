
public class DivideSelf2 {

	public static boolean dividesSelf(int n) {
		int x = n;
		while (x > 0) {
			if (x % 10 == 0) {
				return false;
			}
			if (n % (x % 10) != 0) {
				return false;
			}
			x = x / 10;
		}
		return true;
		}
	
	public static void main(String[] args) {
		int n = 128;
		System.out.println(dividesSelf(n));
	}
}
