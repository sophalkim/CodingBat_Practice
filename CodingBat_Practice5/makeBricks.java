public boolean makeBricks(int small, int big, int goal) {
	int totalS = small * 1;
	int totalB = big * 5;
	if (goal == totalB + totalS) return true;
	if (goal == totalB) return true;
	if (goal == totalS) return true;
	if (totalB > goal) {
		if (goal % 5 <= small) {
			return true;
		}
	}
	if (totalB < goal) {
		if (goal <= totalB + totalS) return true;
	}
	return false;
}