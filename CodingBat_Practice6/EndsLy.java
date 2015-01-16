public boolean endsLy(String str) {
	int len = str.length();
	if (len < 2) {
		return false;
	}
	if (str.substring(len - 2, len).equals("ly")) {
		return true;
	}
	return false;
}