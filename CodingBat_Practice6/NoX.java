public String noX(String str) {
	String result = "";
	int len = str.length();
	if (len <= 0) return result;
	if (!str.substring(0, 1).equals("x")) {
		result += str.substring(0, 1);
	}
	return result + noX(str.substring(1));
}