package Recursion;

public class SumDigits {

	public static int sumDigits(int n) {
		int sum = 0;
		if (n == 0) {
			return 0;
		}
		sum = n % 10;
		return sum + sumDigits(n / 10);
	}
	
	// Factorial using compact recursion
	public static int fR(int x) {
		if (x == 1) {
			return 1;
		}
		return x * fR(x - 1);
	}
	
	
	public static void main(String[] args) {
		int x = 126;
		System.out.println(sumDigits(x));
	}
}
