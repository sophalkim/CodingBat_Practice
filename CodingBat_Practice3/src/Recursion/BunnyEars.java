package Recursion;

public class BunnyEars {

	public static int bunnyEars(int bunnies) {
		if (bunnies == 1) {
			return 2;
		}
		return bunnyEars(bunnies - 1) + 2;
	}
	
	// Factorial using compact recursion
	public static int fR(int x) {
		if (x == 1) {
			return 1;
		}
		return x * fR(x - 1);
	}
	
	
	public static void main(String[] args) {
		int x = 8;
		System.out.println(bunnyEars(x));
	}
}
