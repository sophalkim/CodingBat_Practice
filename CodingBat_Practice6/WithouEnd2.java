public String withouEnd2(String str) {
	int len = str.length();
	if (len < 3) {
		return "";
	}
	return str.substring(1, len - 1);
}