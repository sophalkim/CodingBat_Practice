package November2013;

public class loneSum {

	public static int loneSum(int a, int b, int c) {
		  return fixTeen(a) + fixTeen(b) + fixTeen(c);
	}
	
	public static int fixTeen(int n) {
		if (n >= 13 && n <= 19) {
			if (n == 15 || n == 16) {
				return n;
			} else {
				return 0;
			}
		}
		return  n;
	}
	
	
	public static void main(String[] args) {
		
		int a = 2;
		int b = 13;
		int c = 1;
		System.out.println(loneSum(a, b, c));
	}
}
