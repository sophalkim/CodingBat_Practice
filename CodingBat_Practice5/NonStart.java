public String nonStart(String a, String b) {
	int lenA = a.length();
	int lenB = b.length();
	if (lenA <= 1) {
		return b.substring(1, lenB);
	}
	if (lenB <= 1) {
		return a.substring(1, lenA);
	}
	return a.substring(1, a.length()) + b.substring(1, b.length());
	It's not commiting
}