
public class BiggerTwo {

	public static int[] biggerTwo(int[] a, int[] b) {
		if (a[0] + a[1] >= b[0] + b[1]) {
			return a;
		} else {
			return b;
		}
	}
	
	
	public static void main(String[] args) {
		int[] a = {3, 4};
		int[] b = {1, 2};
		System.out.println(biggerTwo(a, b));
	}
}
