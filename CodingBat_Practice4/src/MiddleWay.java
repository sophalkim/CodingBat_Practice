
public class MiddleWay {

	public static int[] middleWay(int[] a, int[] b) {
		int[] x = new int[2];
		x[0] = a[1];
		x[1] = b[1];
		return x;
	}
	
	
	public static void main(String[] args) {
		int[] a = {7, 7, 7};
		int[] b = {3, 8, 0};
		System.out.println(middleWay(a, b));
	}
}
