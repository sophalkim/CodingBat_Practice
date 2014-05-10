package Practice3;

public class CommonTwo {

	public static int commonTwo(String[] a, String[] b) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (i > 0 && i + 1 < a.length && a[i].equals(a[i - 1])) {
				continue;
			}
			for (int j = 0; j <b.length; j++) {
				if (a[i].equals(b[j])) {
					count++;
					break;
				}
			}
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		String[] a = {"a", "b", "c"};
		String[] b = {"a", "b", "c"};
		System.out.println(commonTwo(a, b));
	}
}
