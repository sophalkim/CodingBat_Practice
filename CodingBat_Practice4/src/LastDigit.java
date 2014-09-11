public boolean lastDigit(int a, int b, int c) {
	int x = a % 10;
	int y = b % 10;
	int z = c % 10;
	return (x == y || x == z || y == z);
}