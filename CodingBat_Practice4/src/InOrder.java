
public class InOrder {

	public static boolean inOrder(int a, int b, int c, boolean bOk) {
		if (bOk && c > b) {
			return true;
		}
		if (b > a && c > b) {
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 4;
		boolean bOk = false;
		System.out.println(inOrder(a, b, c, bOk));
	}
}
