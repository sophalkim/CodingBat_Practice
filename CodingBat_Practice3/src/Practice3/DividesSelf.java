package Practice3;

public class DividesSelf {

	public static boolean dividesSelf(int n) {
		int z = n;
		while (z > 0) {
			int x = z % 10;
			int y = z / 10;
			if (x != 0 && n % x != 0) {
				return false;
			}
		    z = y;
		  }
		  return true;
	}
	
	
	public static void main(String[] args) {
		int n = 32;
		System.out.println(dividesSelf(n));
	}
}
