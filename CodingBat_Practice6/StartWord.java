public String startWord(string str, String word) {
	int lenS = str.length();
	int lenW = word.length();
	if (lenW <= lenS) {
		if (lenW <= 1) {
			return str.substring(0, 1);
		}
		if (word.substring(1, lenW).equals(str.substring(1, lenW))) {
			return str.substring(0, 1) + word.substring(1);
		}
	}
	return "";
}