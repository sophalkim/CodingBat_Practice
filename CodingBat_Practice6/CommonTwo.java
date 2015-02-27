public class CommonTwo {
	
	String[] a = {"a", "c", "x"};
	String[] b = {"a", "b", "c", "x", "z"};
	
	public int commonTwo(String[] a, String[] b) {
		int count = 0;
		int lenA = a.length;
		int lenB = b.length;
		if (lenA == 0 || lenB == 0) return 0;
		for (int i = 0; i < lenA; i++) {
			if (i + 1 < lenA && a[i] == a[i + 1]) continue;
			for (int j = 0; j < lenB; j++) {
				if (a[i] == b[j]) {
					count++;
					break;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		CommonTwo c = new CommonTwo();
		System.out.println(commonTwo(a, b));
	}
}

