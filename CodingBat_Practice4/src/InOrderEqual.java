
public class InOrderEqual {

	public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		if (equalOk && b >= a && c >= b) {
			return true;
		}
		if (c > b && b > a) {
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		int c = 6;
		boolean equalOk = false;
		System.out.println(inOrderEqual(a, b, c, equalOk));
	}
}
