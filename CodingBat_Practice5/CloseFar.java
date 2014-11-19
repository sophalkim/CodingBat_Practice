public boolean closeFar(int a, int b, int c) {
	int x = Math.abs(a - b);
	int y = Math.abs(b - c);
	int z = Math.abs(a - c);

	if (x <= 1 && y >=2 || x <=1 && z >= 2) {
		return true;
	}
	if (y <= 1 && x >= 2 || y <= 1 && z >= 2) {
		return true;
	}
	if (z <= 1 && x >= 2 || z <= 1 && y >= 2) {
		return true;
	}
	return false;
}