public String seeColor(String str) {
	int len = str.length();
	if (len >= 3 && str.substring(0, 3).equals("red"))
		return "red";
	if (len >= 4 && str.substring(0, 4).equals("blue"))
		return "blue";
	return "";
}