public boolean equalIsNot(String str) {
	int len = str.length();
	String x = "is";
	String y = "not";
	int is = 0;
	int not = 0;
	for (int i = 0; i < len; i++) {
		if (i + 1 < len) {
			if (str.substring(i, i + 2).equals(x)) is++;
		}
		if (i + 2 < len) {
			if (str.substring(i, i + 3).equals(y)) not++;
		}
	}
	return (is == not);
}