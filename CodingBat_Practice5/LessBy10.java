public boolean lessBy10(int a, int b, int c) {
	int x = Math.abs(a - b);
	int y = Math.abs(a - c);
	int z = Math.abs(b - c);
	if (x >= 10 || y >= 10 || z >= 10) {
		return true;
	}
	return false;
}