public String wordEnds(String str, String word) {
	int lenS = str.length();
	int lenW = word.length();
	String x = "";
	for (int i = 0; i < lenS; i++) {
		if (i + lenW <= lenS && str.substring(i, i + lenW).equals(word)) {
			if (i - 1 >= 0) {
				x += str.charAt(i - 1);
			}
		}
		if (i + lenW + 1 <= lenS && str.substring(i, i + lenW).equals(word)) {
			x += str.charAt(i + lenW);
		}
	}
	return x;
}