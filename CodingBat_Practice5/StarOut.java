public String startOut(String str) {
	String x = "";
	int len = str.length();
	for (int i = 0; i < len; i++) {
		if (i + 1 < len && str.charAt(i + 1) == '*') {
			if (i+ 2 < len && str.charAt(i + 2) == '*') {
				i+=3;
			} else {
				i+=2;
			}
		} else {
			x += str.charAt(i);
		}
	}
	return x;
}