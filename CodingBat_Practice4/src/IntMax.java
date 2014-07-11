
public class IntMax {

	public static int intMax(int a, int b, int c) {
		return Math.max(Math.max(a, b), c);	
	}
	
	
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		System.out.println(intMax(a, b, c));
	}
}
