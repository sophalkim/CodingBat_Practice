
public class PlusTwo {

	public static int[] plusTwo(int[] a, int[] b) {
		int[] x = new int[4];
		x[0] = a[0];
		x[1] = a[1];
		x[2] = b[0];
		x[3] = b[1];
		return x;
	}
	
	
	public static void main(String[] args) {
		int[] a = {9, 2};
		int[] b = {3, 4};
		System.out.println(plusTwo(a, b));
	}
}
