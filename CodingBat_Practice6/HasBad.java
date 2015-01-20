public boolean hasBad(String str) {
	int len = str.length();
	if (len <= 2) {
		return false;
	}
	if (str.substring(0, 3).equals("bad")) {
		return true;
	}
	if (len >= 4 && str.substring(1, 4).equals("bad")) {
		return true;
	}
	return false;
}