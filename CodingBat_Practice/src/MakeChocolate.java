
public class MakeChocolate {

	public static int makeChocolate(int small, int big, int goal) {
		int s = small * 1;
		int b = big * 5;
		if (s + b == goal) return small;
		if (goal - b < s && goal - b >= 0) {
			return goal - b;
		}
		if (s + b > goal) {
			for (int i = 0; i <= b; i++) {
				int x = i * 5;
				if (goal - x <= s && goal - x >= 0) {
					return goal - x;
				}
			}
		}
		return -1;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(makeChocolate(1, 2, 7));
	}

	static {
//		if (b > goal) {
//		int x = (big - 1) * 5;
//		if (goal - x <= s) {
//			if (x + s < goal) {
//				return -1;
//			}
//			return goal - x;
//		}
//	}
	}

}
