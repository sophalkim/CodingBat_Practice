public String lastTwo(String str) {
	int len = str.length();
	if (len <= 1) {
		return str;
	}
	return str.substring(0, len - 2) + str.substring(len - 1, len) + str.substring(len - 2, len - 1);
}