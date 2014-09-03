
public class TwoAsOne {

	public static boolean twoAsOne(int a, int b, int c) {
		return (a + b == c || b + c == a || a + c == b);
	}
	
	
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		System.out.println(twoAsOne(a, b, c));
	}
}
