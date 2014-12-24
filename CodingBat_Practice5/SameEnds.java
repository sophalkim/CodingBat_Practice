public String sameEnds(String str) {
	int len = str.length();
	int middle = len / 2;
	for (int i = middle; i > 0; i--) {
		if (str.substring(0, i).equals(str.substring(len - i, len))) {
			return str.substring(0, i);
		}
	}
	return "";
}