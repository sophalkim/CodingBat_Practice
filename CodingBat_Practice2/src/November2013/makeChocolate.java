package November2013;

public class makeChocolate {

	public static int makeChocolate(int small, int big, int goal) {
		if (big * 5 == goal) {
			return 0;
		}
		if (small >= goal) {
			return goal;
		}
		if (big * 5 + small == goal) {
			return small;
		}
		for (int i = big; i > 0; i--) {
			if (i * 5 + small >= goal) {
				if ((i - 1) * 5 + small < goal) {
					return -1;
				}
				if (goal - (i * 5) < 0) {
					if (goal - (i * 5) + ((i - 1) * 5) > small) {
						return -1;
					} else {
						return goal - (i * 5) + ((i - 1) * 5);
					}
				} else {
					return goal - (i * 5);
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int a = 6;
		int b = 2;
		int c = 7;
		System.out.println(makeChocolate(a, b, c));
	}
}
