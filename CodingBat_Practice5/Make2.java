public int[] make2(int[] a, int[] b) {
	int[] x = new int[2];
	int lenA = a.length;
	if (lenA <= 0) {
		x[0] = b[0];
		x[1] = b[1];
		return x;
	}
	if (lenA <= 1) {
		x[0] = a[0];
		x[1] = b[0];
	} else {
		x[0] = a[0];
		x[1] = a[1];
	}
	return x;
}