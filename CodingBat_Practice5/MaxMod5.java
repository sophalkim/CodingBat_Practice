public int maxMod5(int a, int b) {
	if (a == b) reeturn 0;
	if (a % 5 == b % 5) {
		return Math.min(a, b);
	}
	return Math.max(a, b);
}