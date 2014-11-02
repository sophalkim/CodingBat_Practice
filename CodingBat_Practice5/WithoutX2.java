public String withoutX2(String str) {
	int len = str.length();
	if (len >= 2 && str.substring(0, 2).equals("xx")) {
		return str.substring(2);
	}
	if (len >= 2 && str.substring(1, 2).equals("x")) {
		return str.substring(0, 1) + str.substring(2);
	}
	if (len >= 1 && str.substring(0, 1).equals("x")) {
		return str.substring(1);
	}
	return str;
}