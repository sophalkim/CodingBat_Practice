public String stringClean(String str) {
	String result = "";
	int len = str.length();
	if (len <= 0) return "";
	if (len >= 2 && str.charAt(0) == str.charAt(1)) {
		if (len >= 3 && str.charAt(0) == str.charAt(2)) {
			result += str.charAt(0);
			return result + stringClean(str.substring(3));
		}
		result += str.charAt(0);
		return result + stringClean(str.substring(2));
	}
	result += str.charAt(0);
	return result + stringClean(str.substring(1));
}