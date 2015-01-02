public String mirrorEnds(String str) {
	int len = str.length();
	String x = "";
	for (int i = 0; i < len; i++) {
		String z = str.substring(0, i + 1);
		String y = "";
		for (int j = 0; j < i; j++) {
			y += str.charAt(j + 1);
		}
		if (z.equals(y)) {
			x = str.substring(0, i + 1);
		} else {
			return x;
		}
	}
	return x;
}