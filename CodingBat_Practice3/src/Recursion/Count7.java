package Recursion;

public class Count7 {

	public static int count7(int n) {
		int count = 0;
		if (n == 0) {
			return 0;
		}
		if (n % 10 == 7) {
			count++;
		}
		return count + count7(n / 10);
	}
	
	// Factorial using compact recursion
	public static int fR(int x) {
		if (x == 1) {
			return 1;
		}
		return x * fR(x - 1);
	}
	
	
	public static void main(String[] args) {
		int x = 717;
		System.out.println(count7(x));
	}
}
