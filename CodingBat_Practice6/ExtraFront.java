public String extraFront(String str) {
	int len = str.length();
	if (len <= 3) {
		return str + str + str;
	}
	String x = str.substring(0, 2);
	return x + x + x;
}