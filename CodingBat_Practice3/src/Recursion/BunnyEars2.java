package Recursion;

public class BunnyEars2 {

	public static int bunnyEar2(int bunnies) {
		int sum = 0;
		if (bunnies == 0) return 0;
	    if (bunnies % 2 == 0) sum = 3;
	    if (bunnies % 2 == 1) sum = 2;
	    return sum + bunnyEar2(bunnies - 1);
	}
	
	// Factorial using compact recursion
	public static int fR(int x) {
		if (x == 1) {
			return 1;
		}
		return x * fR(x - 1);
	}
	
	
	public static void main(String[] args) {
		int x = 10;
		System.out.println(bunnyEar2(x));
	}
}
