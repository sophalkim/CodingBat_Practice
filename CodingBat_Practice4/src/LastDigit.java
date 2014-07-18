
public class LastDigit {

	public static boolean lastDigit(int a, int b) {
		int x = a % 10;
		int y = b % 10;
		if (x == y) {
			return true;
		}
		return false;	
	}
	
	
	public static void main(String[] args) {
		int a = 7;
		int b = 17;
		System.out.println(lastDigit(a, b));
	}
}
