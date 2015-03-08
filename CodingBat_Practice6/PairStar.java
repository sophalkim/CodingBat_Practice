public String pairStar(String str) {
	String result = "";
	int len = str.length();
	if (len <= 0) return result;
	result += str.substring(0, 1);
	if (len <= 1) return result;
	if (str.substring(0, 1).equals(str.substring(1, 2))) result += '*';
	return result + pairStar(pairStar(str.substring(1)));
}