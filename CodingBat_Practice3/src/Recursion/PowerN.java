package Recursion;

public class PowerN {

	public static int powerN(int base, int n) {
		if (n == 0) {
			return 1;
		}
		return base * powerN(base, n - 1);
	}
	
	public static void main(String[] args) {
		int base = 3;
		int n = 1;
		System.out.println(powerN(base, n));
	}
}
