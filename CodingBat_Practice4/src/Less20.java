
public class Less20 {

	public static boolean less20(int n) {
		return ((n + 1) % 20 == 0 || (n + 2) % 20 == 0);
	}
	
	
	public static void main(String[] args) {
		int n = 19;
		System.out.println(less20(n));
	}
}
