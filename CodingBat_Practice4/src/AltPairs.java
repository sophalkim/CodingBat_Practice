public String altPairs(String str) {
	String x = "";
	for (int i = 0; i < str.length(); i+=4) {
		x += str.charAt(i);
		if (i + 1 < str.length()) {
			x += str.charAt(i + 1);
		}
	}
	return x;
}