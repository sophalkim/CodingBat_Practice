public String plusOut(String str, String word) {
	int len = str.length();
	int lenW = word.length();
	int index = 0;
	String x = "";
	for (int i = 0; i < len; i++) {
		if (i + lenW <= len && str.substring(i, i + lenW).equals(word)) {
			x += str.substring(i, i + lenW);
			i += lenW - 1;
			continue;
		}
		x += "+";
	}
	return x;
}