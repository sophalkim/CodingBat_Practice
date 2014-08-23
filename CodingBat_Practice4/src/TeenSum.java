
public class TeenSum {

	public static int teenSum(int a, int b) {
		int sum = a + b;
		if (a >= 13 && a <= 19 || b >= 13 && b <= 19 ) {
			return 19;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		int a = 10;
		int b = 13;
		System.out.println(teenSum(a, b));
	}
}
