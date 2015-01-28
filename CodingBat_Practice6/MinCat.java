public String minCat(String a, String b) {
	int lenA = a.length();
	int lenB = b.length();
	if (lenA > lenB) {
		return a.substring(lenA - lenB) + b;
	}
	if (lenB > lenA) {
		return a + b.substring(lenB - lenA);
	}
	return a + b;
}