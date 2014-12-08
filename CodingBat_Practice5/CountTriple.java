public int countTriple(String str) {
	int len = str.length();
	int count = 0;
	if (len < 3) {
		return count;
	}
	for (int i = 0; i < len - 2; i++) {
		if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
			count++;
		}
	}
	return count;
}