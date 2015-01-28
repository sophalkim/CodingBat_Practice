public boolean frontAgain(String str) {
	int len = str.length();
	if (len <= 1) {
		return false;
	}
	return str.substring(0, 2).equals(str.substring(len-2, len));
}