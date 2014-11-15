public int luckySum(int a, int b, int c) {
	int sum = a + b + c;
	if (a == 13) return 0;
	if (b == 13) return a;
	if (c == 13) return b + c;
	return sum;
}