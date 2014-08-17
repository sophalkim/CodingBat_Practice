
public class More20 {

	public static boolean more20(int n) {
		int remainder = n % 20;
		if (remainder <= 2 && remainder > 0) {
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		int n = 21;
		System.out.println(more20(n));
	}
}
