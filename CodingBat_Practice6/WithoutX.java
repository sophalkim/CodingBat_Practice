public String withoutX(String str) {
	int len = str.length();
	if (len >= 2 && str.substring(0, 1).equals("x") && str.substring(len - 1, len).equals("x"))
		return str.substring(1, len - 1);
	if (len >= 1 && str.substring(len - 1, len).equals("x"))
		return str.substring(0, len - 1);
	if (len >= 1 && str.substring(0, 1).equals("x"))
		return str.substring(1);
	return str;
}