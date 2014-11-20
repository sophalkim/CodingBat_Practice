public boolean closeFar(int a, int b, int c) {
	int x = Math.abs(a - b);
	int y = Math.abs(a - c);
	int z = Math.abs(b - c);
	if (x <= 1 && y >= 2 && z >= 2) {
		return true;
	}
	if (y <= 1 && x >= 2 && z >= 2) {
		return true;
	}
	return false;
}