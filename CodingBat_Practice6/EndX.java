public String endX(String str) {
	int count = 0;
	String result = "";
	int len = str.length();
	if (len <= 0) {
		String x = "";
		for (int i = 0; i < count; i++) {
			x += "x";
		}
		return result + x;
	}
	if (str.substring(0, 1).equals("x")) {
		count++;
	} else {
		result += str.substring(0, 1);
	}
	return result + endX(str.substring(1));
}