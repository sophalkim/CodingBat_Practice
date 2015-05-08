public String doubleChar(String str) {
	String x = "";
	for (int i = 0; i < str.length(); i++) {
		x += str.substring(i, i + 1) + str.substring(i, i + 1);
	}
	return x;
}