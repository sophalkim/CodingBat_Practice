
public class Start1 {

	public static int start1(int[] a, int[] b) {
		int count = 0;
		if (a.length > 0 && a[0] == 1) count++;
		if (b.length > 0 && b[0] == 1) count++;
		return count;
	}
	
	
	public static void main(String[] args) {
		int[] a = {7, 2, 3};
		int[] b = {1};
		System.out.println(start1(a, b));
	}
}
