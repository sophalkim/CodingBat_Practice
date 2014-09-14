public String extraEnd(String str) {
	String x = str.substring(str.length() - 2, str.length());
	return x + x + x;
}