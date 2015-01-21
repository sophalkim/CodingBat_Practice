public String lastChars(String a, String b) {
	int lenA = a.length();
	int lenB = b.length();
	String x = "";
	if (lenA >= 1) {
		x += a.substring(0, 1);
	} else {
		x += '@';
	}
	if (lenB >= 1) {
		x += b.substring(lenB-1, lenB);
	} else {
		x += '@';
	}
	return x;
}