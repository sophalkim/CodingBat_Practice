public String conCat(String a, String b) {
	int len = a.length();
	int lenB = b.length();
	if (len <= 0) {
		return b;
	}
	if (lenB <= 0) {
		return a;
	}
	if (a.substring(len-1, len).equals(b.substring(0, 1))) {
		return a + b.substring(1);
	}
	return a + b;
}