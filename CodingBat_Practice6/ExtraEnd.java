public String extraEnd(String str) {
	int len = str.length();
	String x = str.substring(len - 2, len);
	return x + x + x;
}