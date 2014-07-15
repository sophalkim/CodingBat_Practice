
public class CommonEnd {

	public static boolean commonEnd(int[] a, int[] b) {
		int lenA = a.length;
		int lenB = b.length;
		if (a[0] == b[0]) {
			return true;
		}
		if (a[lenA - 1] == b[lenB - 1]) {
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		int[] b = {7, 3};
		System.out.println(commonEnd(a, b));
	}
}
