public String changeXY(String str) {
	String result = "";
	int len = str.length();
	if (len < 1) return result;
	if (str.substring(0, 1).equals("x")) {
		result += "y";
	} else {
		result += str.substring(0, 1);
	}
	return result + changeXY(str.substring(1));
}