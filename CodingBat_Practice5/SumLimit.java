public int sumLimit(int a, int b) {
	String a = a + "";
	int lenA = a.length();
	int sum = a + b;
	String sumString = sum + "";
	int lenS = sumString.length();
	if (lenA == lenS) {
		return sum;
	}
	return a;
}