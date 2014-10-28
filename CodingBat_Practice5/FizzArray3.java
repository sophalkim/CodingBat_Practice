public int[] fizzArray3(int start, int end) {
	int[] x = new int[end - start];
	int count = 0;
	for (int i = start; i < end; i++) {
		x[count] = i;
		count++;
	}
	return x;
}