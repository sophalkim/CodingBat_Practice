public int blueTicket(int a, int b, int c) {
	int sumA = a + b;
	int sumB = a + c;
	int sumC = b + c;
	if (sumA == 10 || sumB == 10 || sumC == 10) {
		return 10;
	}
	if (sumA == sumB + 10 || sumA == sumC + 10) {
		return 5;
	}
	return 0;
}