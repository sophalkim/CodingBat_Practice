package November2013;

public class divideSelf {

	public static boolean divideSelf(int n) {
			// find the number of digits
			int digits = 1;
			for (int i = 0; i <= n; i++) {
				if (i >= 10) {
					digits = 2;
				}
				if (i >= 100) {
					digits = 3;
				}
			}
			// determining individual elements
			int x = 0;
			int y = 0;
			int z = 0;
			if (digits == 3) {
				x = n / 100;
				y = (n % 100) / 10;
				z = (n % 100) % 10;
				if (x == 0 || y == 0 || z == 0) {
					return false;
				}
			}
			if (digits == 2) {
				x = n / 10;
				y = n % 10;
				if (x == 0 || y == 0) {
					return false;
				}
			}
			// Test if they divide evenly into n
			int r1 = 0;
			int r2 = 0;
			int r3 = 0;
			r1 = n % x;
			r2 = n % y;
			if (r1 != 0 || r2 != 0) {
				return false;
			}
			if (digits == 3) {
				r3 = n % z;
				if (r3 != 0) {
					return false;
				}
			}
		    return true;
		}
	
	
	public static void main(String[] args) {
		
		int n = 120;
		System.out.println(divideSelf(n));
	}
}
