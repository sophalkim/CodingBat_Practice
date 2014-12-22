public int scoresSpecial(int[] a, int[] b) {
	return max(a) + max(b);
}

public int max(int[] x) {
	int max = 0;
	for (int i = 0; i < x.length; i++) {
		if (x[i] % 10 == 0) {
			max = Math.max(max, x[i]);
		}
	}
	return max;
}