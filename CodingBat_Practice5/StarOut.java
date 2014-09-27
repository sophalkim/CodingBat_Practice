public String startOut(String str) {
	String x = "";
	int len = str.length();
	int count = 0;
	if (len <= 0) {
		return x;
	}
	if (str.charAt(0) == '*') {
		count = 2;
	}
	for (int i = count; i < len; i++) {
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