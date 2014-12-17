public int sumDigits(String str) {
	int sum = 0;
	int len = str.length();
	for (int i = 0; i < len; i++) {
		if (Character.isDigit(str.charAt(i))) {
			sum += Integer.parseInt(str.substring(i, i + 1));
		}
	}
	return sum;
}