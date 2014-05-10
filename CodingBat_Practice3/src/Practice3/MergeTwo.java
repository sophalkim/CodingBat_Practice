package Practice3;

public class MergeTwo {

	public static String[] mergeTwo(String[] a, String[] b, int n) {
		String[] x = new String[n];
		int index = 0;
		int indexA = 0;
		int indexB = 0;
		String max = "z";
		for (int i = 0; i < n; i++) {
			if (index < n) {
				for (int j = 0; j < n; j++) {
					System.out.println("a[j] = " + a[j] + " b[j] = " + b[j]);
					String z = isBigger(a[j], b[j]);
					System.out.println("isBigger: " + isBigger(a[j], b[j]));
					System.out.println("i:" + i + " index:" + index + " j:" + j);
					if (index == 0) {
						max = z;
						break;
					}
					if (index == 1) {
						String y = x[index - 1];
						if (!a[j].equals(y) && a[j].equals(z)) {
							max = isBigger(max, a[j]);	
						}
						if (!b[j].equals(y) && b[j].equals(z)) {
							max = isBigger(max, b[j]);
						}
					}
					if (index == 2) {
						String y = x[index - 1];
						String w = x[index - 2];
						if (!a[j].equals(y) && !a[j].equals(w)) {
							max = isBigger(max, a[j]);	
						}
						if (!b[j].equals(y) && !b[j].equals(w)) {
							max = isBigger(max, b[j]);	
						}
					}
				}
				x[index] = max;
				index++;
				max = "z";
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(x[i]);
		}
		return x;
	}
	
	public static String isBigger(String a, String b) {
		if (a.compareTo(b) < 0) {
			return a;
		} else {
			return b;
		}
	}
	
	public static void main(String[] args) {
		String[] a = {"x", "y", "z"};
		String[] b = {"a", "b", "z"};
		int n = 3;
		System.out.println(mergeTwo(a, b, n));
	}
}