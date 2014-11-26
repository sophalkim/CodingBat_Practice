public boolean evenlySpaced(int a, int b, int c) {
	int x = Math.abs(a - b);
	int y = Math.abs(b - c);
	int z = Math.abs(a - c);
	if (x == y) {
		return true;
	}
	if (y == z && a != b) {
		return true;
	}
	if (x == z && b != c) {
		return true;
	}
	return false;
}