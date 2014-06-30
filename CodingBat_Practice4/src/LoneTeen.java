
public class LoneTeen {

	public static boolean loneTeen(int a, int b) {
		boolean x = a >= 13 && a <= 19;
		boolean y = b >= 13 && b <= 19;
		if (x && y) {
			return false;
		}
		return x || y;
	}
	
	
	public static void main(String[] args) {
		int a = 13;
		int b = 99;
		System.out.println(loneTeen(a, b));
	}
}
