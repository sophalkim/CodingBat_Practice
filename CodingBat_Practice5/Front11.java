public int[] front11(int[] a, int[] b) {
	int lenA = a.length;
	int lenB = b.length;
	if (lenA <= 0 && lenB <= 0) {
		return a;
	}
	if (lenA <= 0) {
		int[] x = new int[1];
		x[0] = b[0];
		return x;
	}
	if (lenB <= 0) {
		int[] x = new int[1];
		x[0] = a[0];
		return x;
	}
	int[] x = new int[2];
	x[0] = a[0];
	x[1] = b[0];
	return x;
}