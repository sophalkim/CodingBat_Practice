
public class LoneSum {

	public int loneSum(int a, int b, int c) {
		if (a == b && b == c) return 0;
		if (a == b) return c;
		if (a == c) return b;
		if (b == c) return a;
		return a + b + c;
	}
	
	public static void main(String[] args) {
		
	}
}
